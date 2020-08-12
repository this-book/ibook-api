package com.ibook.mapper;

import com.ibook.entity.Noveltype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface NoveltypeMapper extends BaseMapper<Noveltype> {


    /**
     * @描述 通过小说ID获取对应类型
     * @参数 小说ID
     * */
    @Select("select NovelTypeName from Noveltype,Novel_Noveltype where Noveltype.NovelTypeID=Novel_Noveltype.NovelTypeID and Novel_Noveltype.NovelID=${NovelID}")
    List<Noveltype> getNovelTypeByNovelID(Integer NovelID);

}
