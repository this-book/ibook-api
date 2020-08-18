package com.ibook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

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
public class Novel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说ID
     */
    @TableId(value = "NovelID", type = IdType.AUTO)
    private Integer NovelID;

    /**
     * 小说名字
     */
    @TableField("NovelName")
    private String NovelName;

    /**
     * 小说图片
     */
    @TableField("NovelImg")
    private String NovelImg;

    /**
     * 是否完结
     */
    @TableField("IsOver")
    private Boolean IsOver;

    /**
     * 是否免费
     */
    @TableField("IsFree")
    private Boolean IsFree;

    /**
     * 月票
     */
    @TableField("MonthlyTicket")
    private Integer MonthlyTicket;

    /**
     * 周票
     */
    @TableField("WeeklyTicket")
    private Integer WeeklyTicket;

    /**
     * 日票
     */
    @TableField("DayTicket")
    private Integer DayTicket;

    /**
     * 作品介绍
     */
    @TableField("WorkInfo")
    private String WorkInfo;

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

    /**
     * 作者
     */
    /*@TableField("Author")
    private String Author;*/

    /**
     * 小说类型
     */
    /*@TableField("NovelType")
    private String NovelType;*/

    /**
     *  小说章节列表
     */
    @TableField(exist = false)//表示非表中字段
    List<Chapter> chapters;

    /**
     * 作者
     */
    @TableField(exist = false)
    User user;

    /**
     *  小说类型
     * */
    @TableField(exist = false)
    List<Noveltype> noveltypes;

}
