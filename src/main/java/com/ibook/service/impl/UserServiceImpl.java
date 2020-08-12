package com.ibook.service.impl;

import com.ibook.entity.User;
import com.ibook.mapper.UserMapper;
import com.ibook.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getAuthor(Integer NovelID) {
        return userMapper.getAuthor(NovelID);
    }
}
