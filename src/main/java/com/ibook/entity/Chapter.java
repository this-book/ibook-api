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
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说章节表ID
     */
    @TableId(value = "ChapterID", type = IdType.AUTO)
    private Integer ChapterID;

    /**
     * 小说表ID
     */
    @TableField("NovelID")
    private Integer NovelID;

    /**
     * 小说章名字
     */
    @TableField("ChapterName")
    private String ChapterName;

    /**
     * 章节详情
     */
    @TableField("ChapterDetails")
    private String ChapterDetails;

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
     * 逻辑删除
     */
    @TableField("Del")
    private Boolean Del;


}
