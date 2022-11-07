package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Comment;
import cn.cls.blog.service.CommentService;
import cn.cls.blog.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_comment】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
        implements CommentService {

}




