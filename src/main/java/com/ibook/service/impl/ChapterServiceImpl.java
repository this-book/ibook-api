package com.ibook.service.impl;

import com.ibook.entity.Chapter;
import com.ibook.mapper.ChapterMapper;
import com.ibook.service.ChapterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter> implements ChapterService {

    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public List<Chapter> byNovelID(Integer NovelID) {
        return chapterMapper.byNovelID(NovelID);
    }
}
