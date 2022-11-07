package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Tag;
import cn.cls.blog.service.TagService;
import cn.cls.blog.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_tag】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
        implements TagService {

}




