package com.ibook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class Bookshelf implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 书架表ID
     */
    @TableId("BookShelfID")
    private Integer BookShelfID;

    /**
     * 拥有者手机号码
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 小说表ID
     */
    @TableField("NovelID")
    private Integer NovelID;

    /**
     * 逻辑删除
     */
    @TableField("Del")
    private Boolean Del;


}
