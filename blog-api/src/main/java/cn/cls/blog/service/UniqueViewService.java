package cn.cls.blog.service;

import cn.cls.blog.dto.UniqueViewDTO;
import cn.cls.blog.entity.UniqueView;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_unique_view】的数据库操作Service
 * @createDate 2022-11-07 19:30:49
 */
public interface UniqueViewService extends IService<UniqueView> {

    List<UniqueViewDTO> listUniqueViews();
}
