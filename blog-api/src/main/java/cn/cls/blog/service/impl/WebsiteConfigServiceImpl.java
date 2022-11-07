package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.WebsiteConfig;
import cn.cls.blog.service.WebsiteConfigService;
import cn.cls.blog.mapper.WebsiteConfigMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_website_config】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class WebsiteConfigServiceImpl extends ServiceImpl<WebsiteConfigMapper, WebsiteConfig>
        implements WebsiteConfigService {

}




