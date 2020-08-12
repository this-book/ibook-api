package com.ibook.entity;

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
public class NovelNoveltype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说ID
     */
    @TableField("NovelID")
    private Integer NovelID;

    /**
     * 类型表ID
     */
    @TableField("NovelTypeID")
    private Integer NovelTypeID;

    /**
     * 逻辑删除
     */
    @TableField("Del")
    private Boolean Del;

    public NovelNoveltype(Integer novelID, Integer novelTypeID, Boolean del) {
        NovelID = novelID;
        NovelTypeID = novelTypeID;
        Del = del;
    }
}
