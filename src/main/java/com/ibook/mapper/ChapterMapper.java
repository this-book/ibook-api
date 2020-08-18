package com.ibook.mapper;

import com.ibook.entity.Chapter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface ChapterMapper extends BaseMapper<Chapter> {

    @Select("select * from chapter where NovelID=${NovelID}")
    List<Chapter> byNovelID(Integer NovelID);

}
