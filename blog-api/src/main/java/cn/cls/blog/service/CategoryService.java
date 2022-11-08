package cn.cls.blog.service;

import cn.cls.blog.dto.CategoryBackDTO;
import cn.cls.blog.dto.CategoryDTO;
import cn.cls.blog.dto.CategoryOptionDTO;
import cn.cls.blog.entity.Category;
import cn.cls.blog.vo.CategoryVO;
import cn.cls.blog.vo.ConditionVO;
import cn.cls.blog.vo.PageR;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_category】的数据库操作Service
 * @createDate 2022-11-07 19:30:48
 */
public interface CategoryService extends IService<Category> {

    PageR<CategoryDTO> listCategories();

    PageR<CategoryBackDTO> listBackCategories(ConditionVO condition);

    List<CategoryOptionDTO> listCategoriesBySearch(ConditionVO condition);

    void saveOrUpdateCategory(CategoryVO categoryVO);

    void deleteCategory(List<Integer> categoryIdList);
}
