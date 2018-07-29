package com.pinyougou.portal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.content.service.ContentService;
import com.pinyougou.pojo.Content;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 广告控制器
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2018-01-11<p>
 */
@RestController
@RequestMapping("/content")
public class ContentController {

    @Reference(timeout = 6000)
    private ContentService contentService;

    /**
     * 根据广告分类ID查询广告列表
     * @param categoryId
     */
    @GetMapping("/findContentByCategoryId")
    public List<Content> findContentByCategoryId(Long categoryId) {
        return contentService.findContentByCategoryId(categoryId);
    }
}
