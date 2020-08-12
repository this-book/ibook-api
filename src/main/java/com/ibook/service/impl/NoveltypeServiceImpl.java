package com.ibook.service.impl;

import com.ibook.entity.Noveltype;
import com.ibook.mapper.NoveltypeMapper;
import com.ibook.service.NoveltypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@Service
public class NoveltypeServiceImpl extends ServiceImpl<NoveltypeMapper, Noveltype> implements NoveltypeService {

    @Autowired
    private NoveltypeMapper noveltypeMapper;

    @Override
    public Integer getNovelTypeID(String NovelTypeName) {
        return noveltypeMapper.getNovelTypeID(NovelTypeName);
    }
}
