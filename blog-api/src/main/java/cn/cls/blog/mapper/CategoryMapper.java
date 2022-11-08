package cn.cls.blog.mapper;

import cn.cls.blog.dto.CategoryBackDTO;
import cn.cls.blog.dto.CategoryDTO;
import cn.cls.blog.entity.Category;
import cn.cls.blog.vo.ConditionVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_category】的数据库操作Mapper
 * @createDate 2022-11-07 19:30:48
 * @Entity cn.cls.blog.entity.Category
 */
public interface CategoryMapper extends BaseMapper<Category> {

    List<CategoryDTO> listCategoryDTO();

    List<CategoryBackDTO> listCategoryBackDTO(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);
}




