package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Category;
import cn.cls.blog.service.CategoryService;
import cn.cls.blog.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_category】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:48
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {

}




