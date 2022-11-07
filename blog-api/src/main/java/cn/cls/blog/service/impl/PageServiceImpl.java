package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Page;
import cn.cls.blog.service.PageService;
import cn.cls.blog.mapper.PageMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_page(页面)】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page>
        implements PageService {

}




