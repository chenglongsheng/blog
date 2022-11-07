package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.UserAuth;
import cn.cls.blog.service.UserAuthService;
import cn.cls.blog.mapper.UserAuthMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_user_auth】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth>
        implements UserAuthService {

}




