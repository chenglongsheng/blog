package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.UserInfo;
import cn.cls.blog.service.UserInfoService;
import cn.cls.blog.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_user_info】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
        implements UserInfoService {

}




