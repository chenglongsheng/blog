package cn.cls.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 博客信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogInfoVO {

    /**
     * 关于我内容
     */
    private String aboutContent;

}