package com.kakarote.work.entity.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kakarote.common.entity.UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 项目事项跟进记录/客户活动表VO
 * </p>
 *
 * @author zhangyongjie
 * @since 2022-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "ProjectTaskFollowsVO对象", description = "项目事项跟进记录/客户活动表VO")
public class ProjectTaskFollowsVO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "跟进类型 0 跟进记录 1 客户动态")
    private Integer followType;

    @ApiModelProperty(value = "项目事项主键ID")
    private Long taskId;

    @ApiModelProperty(value = "活动内容")
    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "下次联系时间")
    private LocalDateTime nextTime;

    @ApiModelProperty(value = "0 删除 1 正常")
    private Integer status;

    @ApiModelProperty(value = "创建人id")
    private Long userId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "批次id")
    private String batchId;

    @ApiModelProperty(value = "日期类型，前端需要")
    private Integer timeType;

    @ApiModelProperty(value = "更新人id")
    private Long updateUserId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
    private UserInfo user;
}
