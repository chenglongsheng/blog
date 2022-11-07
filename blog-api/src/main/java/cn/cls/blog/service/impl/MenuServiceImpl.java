package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Menu;
import cn.cls.blog.service.MenuService;
import cn.cls.blog.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_menu】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
        implements MenuService {

}




