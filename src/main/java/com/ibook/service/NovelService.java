package com.ibook.service;

import com.ibook.entity.Novel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface NovelService extends IService<Novel> {
    List<Novel> list();
    Novel getChaptersByNovelID(Integer NovelID);
    List<Novel> getOverNovels();
}
