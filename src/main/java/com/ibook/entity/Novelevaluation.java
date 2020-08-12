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
public class Novelevaluation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说评价表ID
     */
    @TableId(value = "NovelEvaluationID", type = IdType.AUTO)
    private Integer NovelEvaluationID;

    /**
     * 用户手机号码
     */
    @TableField("Phone")
    private String Phone;

    /**
     * 小说表ID
     */
    @TableField("NovelID")
    private Integer NovelID;

    /**
     * 评分
     */
    @TableField("Score")
    private Double Score;

    /**
     * 评价标题
     */
    @TableField("EvaluationTitle")
    private String EvaluationTitle;

    /**
     * 评价详情
     */
    @TableField("EvaluationDetails")
    private String EvaluationDetails;

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
