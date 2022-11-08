package cn.cls.blog.service.impl;

import cn.cls.blog.dto.CategoryBackDTO;
import cn.cls.blog.dto.CategoryDTO;
import cn.cls.blog.dto.CategoryOptionDTO;
import cn.cls.blog.entity.Article;
import cn.cls.blog.exception.BizException;
import cn.cls.blog.service.ArticleService;
import cn.cls.blog.util.BeanCopyUtils;
import cn.cls.blog.util.PageUtils;
import cn.cls.blog.vo.CategoryVO;
import cn.cls.blog.vo.ConditionVO;
import cn.cls.blog.vo.PageR;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Category;
import cn.cls.blog.service.CategoryService;
import cn.cls.blog.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author CLS
 * @description 针对表【tb_category】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:48
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private ArticleService articleService;

    @Override
    public PageR<CategoryDTO> listCategories() {
        return new PageR<>(baseMapper.listCategoryDTO(), baseMapper.selectCount(null));
    }

    @Override
    public PageR<CategoryBackDTO> listBackCategories(ConditionVO condition) {
        //分类数量
        Long count = baseMapper.selectCount(new LambdaQueryWrapper<Category>()
                .like(StringUtils.hasText(condition.getKeywords()), Category::getCategoryName, condition.getKeywords()));
        if (count == 0) {
            return new PageR<>();
        }

        //分页查询分类列表
        List<CategoryBackDTO> records = baseMapper.listCategoryBackDTO(PageUtils.getLimitCurrent(), PageUtils.getSize(), condition);
        return new PageR<>(records, count);
    }

    @Override
    public List<CategoryOptionDTO> listCategoriesBySearch(ConditionVO condition) {
        List<Category> categories = super.list(new LambdaQueryWrapper<Category>().like(StringUtils.hasText(condition.getKeywords()), Category::getCategoryName, condition.getKeywords()));
        return BeanCopyUtils.copyList(categories, CategoryOptionDTO.class);
    }

    @Override
    public void saveOrUpdateCategory(CategoryVO categoryVO) {
        //判断分类名重复
        Category category = super.getOne(new LambdaQueryWrapper<Category>().eq(Category::getCategoryName, categoryVO.getCategoryName()));
        if (!Objects.isNull(category)) {
            throw new BizException("分类名重复");
        }
        super.saveOrUpdate(BeanCopyUtils.copyObject(categoryVO, Category.class));
    }

    @Override
    public void deleteCategory(List<Integer> categoryIdList) {
        //分类下有文章不删除
        long count = articleService.count(new LambdaQueryWrapper<Article>()
                .in(Article::getCategoryId, categoryIdList));
        if (count > 0) {
            throw new BizException("分类还有文章，无法删除分类");
        }
        super.removeBatchByIds(categoryIdList);
    }
}




