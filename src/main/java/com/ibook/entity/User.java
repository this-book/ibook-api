package com.ibook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hxb
 * @since 2020-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户手机号码
     */
    @TableId("Phone")
    private String Phone;

    /**
     * 用户登录密码
     */
    @TableField("Pwd")
    private String Pwd;

    /**
     * 用户头像
     */
    @TableField("HeadImg")
    private String HeadImg;

    /**
     * 昵称
     */
    @TableField("NickName")
    private String NickName;

    /**
     * 用户类型
     */
    @TableField("UserType")
    private Integer UserType;

    /**
     * 是否作者
     */
    @TableField("IsAuthor")
    private Boolean IsAuthor;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 是否可用
     */
    @TableField("IsAble")
    private Boolean IsAble;

    /**
     * 逻辑删除
     */
    @TableField("Del")
    private Boolean Del;

    public User() {
    }

    public User(String phone, String pwd, String headImg, String nickName, Integer userType, Boolean isAuthor, LocalDateTime createTime, LocalDateTime updateTime, Boolean isAble, Boolean del) {
        Phone = phone;
        Pwd = pwd;
        HeadImg = headImg;
        NickName = nickName;
        UserType = userType;
        IsAuthor = isAuthor;
        CreateTime = createTime;
        UpdateTime = updateTime;
        IsAble = isAble;
        Del = del;
    }
}
