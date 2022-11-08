package cn.cls.blog.service;

import cn.cls.blog.entity.Page;
import cn.cls.blog.vo.PageVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author CLS
 * @description 针对表【tb_page(页面)】的数据库操作Service
 * @createDate 2022-11-07 19:30:49
 */
public interface PageService extends IService<Page> {

    List<PageVO> listPages();
}
