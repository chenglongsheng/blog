package cn.cls.blog.controller;

import cn.cls.blog.dto.CategoryBackDTO;
import cn.cls.blog.dto.CategoryDTO;
import cn.cls.blog.dto.CategoryOptionDTO;
import cn.cls.blog.service.CategoryService;
import cn.cls.blog.vo.CategoryVO;
import cn.cls.blog.vo.ConditionVO;
import cn.cls.blog.vo.PageR;
import cn.cls.blog.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查看分类列表
     *
     * @return {@link R<CategoryDTO>} 分类列表
     */
    @GetMapping("/categories")
    public R<PageR<CategoryDTO>> listCategories() {
        return R.ok(categoryService.listCategories());
    }

    /**
     * 查看后台分类列表
     *
     * @param condition 查询条件
     * @return {@link R<CategoryBackDTO>} 后台分类列表
     */
    @GetMapping("/admin/categories")
    public R<PageR<CategoryBackDTO>> listBackCategories(ConditionVO condition) {
        return R.ok(categoryService.listBackCategories(condition));
    }

    /**
     * 搜索文章分类
     *
     * @param condition 查询条件
     * @return {@link R<CategoryOptionDTO>} 分类列表
     */
    @GetMapping("/admin/categories/search")
    public R<List<CategoryOptionDTO>> listCategoriesBySearch(ConditionVO condition) {
        return R.ok(categoryService.listCategoriesBySearch(condition));
    }

    /**
     * 添加或修改分类
     *
     * @param categoryVO 分类信息
     * @return {@link R<>}
     */
//    @OptLog(optType = SAVE_OR_UPDATE)
    @PostMapping("/admin/categories")
    public R<?> saveOrUpdateCategory(@Valid @RequestBody CategoryVO categoryVO) {
        categoryService.saveOrUpdateCategory(categoryVO);
        return R.ok();
    }

    /**
     * 删除分类
     *
     * @param categoryIdList 分类id列表
     * @return {@link R<>}
     */
//    @OptLog(optType = REMOVE)
    @DeleteMapping("/admin/categories")
    public R<?> deleteCategories(@RequestBody List<Integer> categoryIdList) {
        categoryService.deleteCategory(categoryIdList);
        return R.ok();
    }

}
