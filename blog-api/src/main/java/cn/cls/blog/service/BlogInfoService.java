package cn.cls.blog.service;

import cn.cls.blog.dto.BlogBackInfoDTO;
import cn.cls.blog.dto.BlogHomeInfoDTO;
import cn.cls.blog.vo.BlogInfoVO;
import cn.cls.blog.vo.WebsiteConfigVO;

public interface BlogInfoService {

    BlogHomeInfoDTO getBlogHomeInfo();

    BlogBackInfoDTO getBlogBackInfo();

    void updateWebsiteConfig(WebsiteConfigVO websiteConfigVO);

    WebsiteConfigVO getWebsiteConfig();

    String getAbout();

    void updateAbout(BlogInfoVO blogInfoVO);

    void report();

}
