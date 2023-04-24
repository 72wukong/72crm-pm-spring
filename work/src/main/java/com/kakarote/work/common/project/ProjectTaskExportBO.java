package com.kakarote.work.common.project;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("任务导出参数")
public class ProjectTaskExportBO {
    List<Long> taskIds;
    List<String> exportColumn;
    Integer taskType;

    String search;

    @ApiModelProperty("项目ID")
    private String projectId;

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("结束时间")
    private String endTime;
//
//    @ApiModelProperty("状态")
//    private List<Integer> status;

    @ApiModelProperty("类型")
    private Integer type;

    @ApiModelProperty("任务名称")
    private String name;

    @ApiModelProperty(value = "负责人")
    private Long mainUserId;

    @ApiModelProperty(value = "所属迭代ID")
    private Long belongIterationId;
    @ApiModelProperty(value = "所属需求ID")
    private Long relatedDemandId;
    @ApiModelProperty(value = "任务Id")
    private Long taskId;
    @ApiModelProperty(value = "1 平铺 2树结构")
    private Integer showType;
//    @ApiModelProperty(value = "看板状态id")
//    private Long boardStatusId;


    @ApiModelProperty("事项类型筛选")
    private List<Integer> typeQuery;
    @ApiModelProperty(value = "优先级筛选 从大到小 3高 2中 1低 0无")
    private List<Integer> priorityQuery;
    @ApiModelProperty(value = "状态筛选 1未开始 2进行中 3已完成")
    private List<Integer> statusQuery;
    @ApiModelProperty(value = "迭代筛选")
    private List<Long> belongIterationIdQuery;
    @ApiModelProperty(value = "标签筛选")
    private List<Long> labelQuery;
    @ApiModelProperty(value = "负责人")
    private List<Long> mainUserIdQuery;
}
