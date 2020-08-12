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
public class Noveltype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说类型ID
     */
    @TableId(value = "NovelTypeID", type = IdType.AUTO)
    private Integer NovelTypeID;

    /**
     * 小说类型名字
     */
    @TableField("NovelTypeName")
    private String NovelTypeName;

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
