package com.ibook.service;

import com.ibook.entity.Noveltype;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface NoveltypeService extends IService<Noveltype> {
    Integer getNovelTypeID(String NovelTypeName);
}
