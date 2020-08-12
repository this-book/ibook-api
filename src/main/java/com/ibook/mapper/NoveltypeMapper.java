package com.ibook.mapper;

import com.ibook.entity.Noveltype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface NoveltypeMapper extends BaseMapper<Noveltype> {

    @Select("select NovelTypeID from Noveltype where NovelTypeName=#{NovelTypeName}")
    Integer getNovelTypeID(String NovelTypeName);

}
