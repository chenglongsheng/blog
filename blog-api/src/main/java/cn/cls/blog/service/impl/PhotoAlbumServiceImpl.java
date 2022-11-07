package cn.cls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cls.blog.entity.PhotoAlbum;
import cn.cls.blog.service.PhotoAlbumService;
import cn.cls.blog.mapper.PhotoAlbumMapper;
import org.springframework.stereotype.Service;

/**
 * @author CLS
 * @description 针对表【tb_photo_album(相册)】的数据库操作Service实现
 * @createDate 2022-11-07 19:30:49
 */
@Service
public class PhotoAlbumServiceImpl extends ServiceImpl<PhotoAlbumMapper, PhotoAlbum>
        implements PhotoAlbumService {

}




