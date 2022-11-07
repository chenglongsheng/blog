package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Role;
import cn.cls.blog.service.RoleService;
import cn.cls.blog.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_role】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
        implements RoleService {

}




