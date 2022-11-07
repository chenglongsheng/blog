package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.Photo;
import cn.cls.blog.service.PhotoService;
import cn.cls.blog.mapper.PhotoMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_photo(照片)】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo>
        implements PhotoService {

}




