package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Message;
import cn.cls.blog.service.MessageService;
import cn.cls.blog.mapper.MessageMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_message】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message>
        implements MessageService {

}




