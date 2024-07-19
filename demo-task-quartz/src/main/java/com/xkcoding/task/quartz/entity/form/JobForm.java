package com.xkcoding.task.quartz.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 定时任务详情
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-26 13:42
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "定时任务详情")
public class JobForm {
    /**
     * 定时任务全类名
     */
    @NotBlank(message = "类名不能为空")
    @ApiModelProperty(value = "类名", required = true, notes="类名notes")
    private String jobClassName;
    /**
     * 任务组名
     */
    @NotBlank(message = "任务组名不能为空")
    @ApiModelProperty(value = "任务组名", required = true, notes="任务组名notes")
    private String jobGroupName;
    /**
     * 定时任务cron表达式
     */
    @NotBlank(message = "cron表达式不能为空")
    @ApiModelProperty(value = "cron表达式", required = true, notes = "cron表达式notes")
    private String cronExpression;

    @ApiModelProperty(value = "参数")
    private String batchParameter;
}
