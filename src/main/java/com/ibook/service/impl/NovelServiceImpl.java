package com.ibook.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.ibook.entity.Novel;
import com.ibook.mapper.NovelMapper;
import com.ibook.service.NovelService;
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
public class NovelServiceImpl extends ServiceImpl<NovelMapper, Novel> implements NovelService {

    @Autowired
    private NovelMapper novelMapper;

    @Override
    public Novel getChaptersByNovelID(Integer NovelID) {
        return novelMapper.getChaptersByNovelID(NovelID);
    }

    @Override
    public List<Novel> getOverNovels() {
        return novelMapper.getOverNovels();
    }

    @Override
    public List<Novel> getOverNovelsLimit() {
        return novelMapper.getOverNovelsLimit();
    }

    @Override
    public List<Novel> list() {
        return novelMapper.list();
    }
}
