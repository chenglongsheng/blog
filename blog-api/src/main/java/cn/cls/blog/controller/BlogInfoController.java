package cn.cls.blog.controller;

import cn.cls.blog.dto.BlogBackInfoDTO;
import cn.cls.blog.dto.BlogHomeInfoDTO;
import cn.cls.blog.enums.FilePathEnum;
import cn.cls.blog.service.BlogInfoService;
import cn.cls.blog.service.WebSocketService;
import cn.cls.blog.strategy.context.UploadStrategyContext;
import cn.cls.blog.vo.BlogInfoVO;
import cn.cls.blog.vo.R;
import cn.cls.blog.vo.VoiceVO;
import cn.cls.blog.vo.WebsiteConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 * 博客信息控制器
 */
@RestController
public class BlogInfoController {
    @Autowired
    private BlogInfoService blogInfoService;
    @Autowired
    private WebSocketService webSocketService;
    @Autowired
    private UploadStrategyContext uploadStrategyContext;

    /**
     * 查看博客信息
     *
     * @return {@link R<BlogHomeInfoDTO>} 博客信息
     */
    @GetMapping("/")
    public R<BlogHomeInfoDTO> getBlogHomeInfo() {
        return R.ok(blogInfoService.getBlogHomeInfo());
    }

    /**
     * 查看后台信息
     *
     * @return {@link R<BlogBackInfoDTO>} 后台信息
     */
    @GetMapping("/admin")
    public R<BlogBackInfoDTO> getBlogBackInfo() {
        return R.ok(blogInfoService.getBlogBackInfo());
    }

    /**
     * 上传博客配置图片
     *
     * @param file 文件
     * @return {@link R<String>} 博客配置图片
     */
    @PostMapping("/admin/config/images")
    public R<String> savePhotoAlbumCover(MultipartFile file) {
        return R.ok(uploadStrategyContext.executeUploadStrategy(file, FilePathEnum.CONFIG.getPath()));
    }

    /**
     * 更新网站配置
     *
     * @param websiteConfigVO 网站配置信息
     * @return {@link R}
     */
    @PutMapping("/admin/website/config")
    public R<?> updateWebsiteConfig(@Valid @RequestBody WebsiteConfigVO websiteConfigVO) {
        blogInfoService.updateWebsiteConfig(websiteConfigVO);
        return R.ok();
    }

    /**
     * 获取网站配置
     *
     * @return {@link R<WebsiteConfigVO>} 网站配置
     */
    @GetMapping("/admin/website/config")
    public R<WebsiteConfigVO> getWebsiteConfig() {
        return R.ok(blogInfoService.getWebsiteConfig());
    }

    /**
     * 查看关于我信息
     *
     * @return {@link R<String>} 关于我信息
     */
    @GetMapping("/about")
    public R<String> getAbout() {
        return R.ok(blogInfoService.getAbout());
    }

    /**
     * 修改关于我信息
     *
     * @param blogInfoVO 博客信息
     * @return {@link R<>}
     */
//    @OptLog(optType = UPDATE)
    @PutMapping("/admin/about")
    public R<?> updateAbout(@Valid @RequestBody BlogInfoVO blogInfoVO) {
        blogInfoService.updateAbout(blogInfoVO);
        return R.ok();
    }

    /**
     * 保存语音信息
     *
     * @param voiceVO 语音信息
     * @return {@link R<String>} 语音地址
     */
    @PostMapping("/voice")
    public R<String> sendVoice(VoiceVO voiceVO) {
        webSocketService.sendVoice(voiceVO);
        return R.ok();
    }

    /**
     * 上传访客信息
     *
     * @return {@link R}
     */
    @PostMapping("/report")
    public R<?> report() {
        blogInfoService.report();
        return R.ok();
    }

}