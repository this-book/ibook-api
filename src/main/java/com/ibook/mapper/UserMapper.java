package com.ibook.mapper;

import com.ibook.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * @描述 通过小说的ID查询对应的作者
     * */
    @Select("select `user`.phone,NickName,NovelID from `user`,user_novel where `user`.Phone=user_novel.Phone and NovelID=${NovelID}")
    User getAuthor(Integer NovelID);

}
