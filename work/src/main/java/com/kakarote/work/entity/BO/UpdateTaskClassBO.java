package com.kakarote.work.entity.BO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author wyq
 */
@Data
@ApiModel("移动项目任务更新信息")
public class UpdateTaskClassBO {
    @ApiModelProperty(value = "原列表id")
    private Long fromId;

    @ApiModelProperty(value = "原列表任务id")
    private List<Long> fromList;

    @ApiModelProperty(value = "新列表id")
    private Long toId;

    @ApiModelProperty(value = "新列表任务id")
    private List<Long> toList;
}
