package cn.cls.blog.mapper;

import cn.cls.blog.dto.ArticleStatisticsDTO;
import cn.cls.blog.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_article】的数据库操作Mapper
 * @createDate 2022-11-07 19:30:48
 * @Entity cn.cls.blog.entity.Article
 */
public interface ArticleMapper extends BaseMapper<Article> {

    List<ArticleStatisticsDTO> listArticleStatistics();
}




