package cn.cls.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页对象
 *
 * @param <T> 返回数据类型
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageR<T> {
    /**
     * 分页列表
     */
    private List<T> recordList;
    /**
     * 总数
     */
    private Long count;
}
