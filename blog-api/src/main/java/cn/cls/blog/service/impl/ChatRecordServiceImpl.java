package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.ChatRecord;
import cn.cls.blog.service.ChatRecordService;
import cn.cls.blog.mapper.ChatRecordMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_chat_record】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class ChatRecordServiceImpl extends ServiceImpl<ChatRecordMapper, ChatRecord>
        implements ChatRecordService {

}




