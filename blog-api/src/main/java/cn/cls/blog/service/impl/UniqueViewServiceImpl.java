package cn.cls.blog.service.impl;

import cn.cls.blog.dto.UniqueViewDTO;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.UniqueView;
import cn.cls.blog.service.UniqueViewService;
import cn.cls.blog.mapper.UniqueViewMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_unique_view】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class UniqueViewServiceImpl extends ServiceImpl<UniqueViewMapper, UniqueView> implements UniqueViewService {

    @Override
    public List<UniqueViewDTO> listUniqueViews() {
        DateTime startTime = DateUtil.beginOfDay(DateUtil.offsetDay(new Date(), -7));
        DateTime endTime = DateUtil.endOfDay(new Date());
        return baseMapper.listUniqueViews(startTime, endTime);
    }
}




