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
public class Readlog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 阅读日志ID
     */
    @TableId(value = "ReadLogID", type = IdType.AUTO)
    private Integer ReadLogID;

    /**
     * 阅读者手机号码
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 小说ID
     */
    @TableField("NovelID")
    private Integer NovelID;

    /**
     * 阅读章节
     */
    @TableField("ChaptersNum")
    private Integer ChaptersNum;

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
    private LocalDateTime Del;


}
