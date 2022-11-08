package cn.cls.blog.service;

import cn.cls.blog.dto.ArticleStatisticsDTO;
import cn.cls.blog.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_article】的数据库操作Service
 * @createDate 2022-11-07 19:30:48
 */
public interface ArticleService extends IService<Article> {

    /**
     * 文章统计
     *
     * @return {@link List<ArticleStatisticsDTO>} 文章统计结果
     */
    List<ArticleStatisticsDTO> listArticleStatistics();
}
