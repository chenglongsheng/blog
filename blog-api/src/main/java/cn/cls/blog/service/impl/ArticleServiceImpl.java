package cn.cls.blog.service.impl;

import cn.cls.blog.dto.ArticleStatisticsDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Article;
import cn.cls.blog.service.ArticleService;
import cn.cls.blog.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_article】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:48
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public List<ArticleStatisticsDTO> listArticleStatistics() {
        return baseMapper.listArticleStatistics();
    }
}




