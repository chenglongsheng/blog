package cn.cls.blog.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 分类名
     */
    private String categoryName;
    /**
     * 分类下的文章数量
     */
    private Integer articleCount;
}
