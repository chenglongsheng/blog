package cn.cls.blog.mapper;

import cn.cls.blog.dto.UniqueViewDTO;
import cn.cls.blog.entity.UniqueView;
import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_unique_view】的数据库操作Mapper
 * @createDate 2022-11-07 19:30:49
 * @Entity cn.cls.blog.entity.UniqueView
 */
public interface UniqueViewMapper extends BaseMapper<UniqueView> {

    List<UniqueViewDTO> listUniqueViews(@Param("startTime") Date startTime, @Param("endTime") Date endTime);
}




