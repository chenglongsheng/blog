package cn.cls.blog.service.impl;

import cn.cls.blog.service.RedisService;
import cn.cls.blog.util.BeanCopyUtils;
import cn.cls.blog.vo.PageVO;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Page;
import cn.cls.blog.service.PageService;
import cn.cls.blog.mapper.PageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

import static cn.cls.blog.constant.RedisPrefixConst.PAGE_COVER;

/**
 * @author CLS
 * @description 针对表【tb_page(页面)】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {
    @Autowired
    private RedisService redisService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<PageVO> listPages() {
        List<PageVO> pageVOList;
        // 查找缓存信息，不存在则从mysql读取，更新缓存
        Object pageList = redisService.get(PAGE_COVER);
        if (Objects.nonNull(pageList)) {
            pageVOList = JSON.parseObject(pageList.toString(), List.class);
        } else {
            pageVOList = BeanCopyUtils.copyList(baseMapper.selectList(null), PageVO.class);
            redisService.set(PAGE_COVER, JSON.toJSONString(pageVOList));
        }
        return pageVOList;
    }
}




