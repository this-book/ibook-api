package com.ibook.service;

import com.ibook.entity.Noveltype;
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
public interface NoveltypeService extends IService<Noveltype> {
    List<Noveltype> getNovelTypeByNovelID(Integer NovelID);
}
