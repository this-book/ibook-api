package com.ibook.mapper;

import com.ibook.entity.Novel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface NovelMapper extends BaseMapper<Novel> {

    @Select("SELECT NovelID,NovelName,NovelImg,WorkInfo FROM novel")
    @Results(
            @Result(property = "user",column = "NovelID",one = @One(select = "com.ibook.mapper.UserMapper.getAuthor"))
    )
    List<Novel> list();

    /**
     * @描述 根据ID获取小说并得到小说的所有章节
     * @参数 小说的ID
     * */
    @Select("select * from novel where NovelID=${NovelID}")
    @Results(
            value = {
                    @Result(id = true , property = "NovelID" ,column = "NovelID"),
                    @Result(property = "chapters",column = "NovelID",many = @Many(select = "com.ibook.mapper.ChapterMapper.byNovelID"))
            }
    )
    Novel getChaptersByNovelID(Integer NovelID);

    /**
     * @描述 获取所有已完结小说
     * @参数 小说的ID
     * */
    @Select("SELECT NovelID,NovelName,NovelImg,WorkInfo FROM novel where IsOver=TRUE")
    @Results(
            value = {
                    @Result(id = true , property = "NovelID" ,column = "NovelID"),
                    @Result(property = "user",column = "NovelID",one = @One(select = "com.ibook.mapper.UserMapper.getAuthor"))
            }
    )
    List<Novel> getOverNovels();


    /**
     * @描述 获取10个已完结小说
     * @参数 小说的ID
     * */
    @Select("SELECT NovelID,NovelName,NovelImg,WorkInfo FROM novel where IsOver=TRUE limit 0,8")
    @Results(
            value = {
                    @Result(id = true , property = "NovelID" ,column = "NovelID"),
                    @Result(property = "user",column = "NovelID",one = @One(select = "com.ibook.mapper.UserMapper.getAuthor")),
                    @Result(property = "noveltypes",column = "NovelID",many = @Many(select = "com.ibook.mapper.NoveltypeMapper.getNovelTypeByNovelID"))
            }
    )
    List<Novel> getOverNovelsLimit();



}
