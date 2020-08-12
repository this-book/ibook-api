package com.ibook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Chapterreview implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 章节评论ID
     */
    @TableId(value = "ChapterReviewID", type = IdType.AUTO)
    private Integer ChapterReviewID;

    /**
     * 评论者手机号码
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 小说表ID
     */
    @TableField("ChapterID")
    private Integer ChapterID;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 逻辑删除
     */
    @TableField("Del")
    private Boolean Del;


}
