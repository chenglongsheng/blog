package cn.cls.blog.strategy.context;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传策略上下文
 */
@Service
public class UploadStrategyContext {
    public String executeUploadStrategy(MultipartFile file, String path) {
        return null;
    }
}
