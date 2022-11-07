package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.UserRole;
import cn.cls.blog.service.UserRoleService;
import cn.cls.blog.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_user_role】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
        implements UserRoleService {

}




