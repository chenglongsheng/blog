package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Talk;
import cn.cls.blog.service.TalkService;
import cn.cls.blog.mapper.TalkMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_talk】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class TalkServiceImpl extends ServiceImpl<TalkMapper, Talk>
        implements TalkService {

}




