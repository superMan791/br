package com.tech.biran.demo.br.demo.d.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author yzp
 * @date 2021/3/8 13:39
 */
@ApiModel
@Data
public class BscDictInfoDto {

    /**
     * 父节点id
     */
    @ApiModelProperty(value = "父节点id, 默认值: 0")
    private Long pid;

    /**
     * 类别
     */
    @ApiModelProperty(value="父级字典编码")
    @NotBlank(message = "父级字典编码不能为空")
    private String category;


    /**
     * 编码
     */
    @ApiModelProperty(value="字典编码")
    @NotBlank(message = "字典编码不能为空")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty(value="字典名称")
    private String name;

    /**
     * 排序号
     */
    @ApiModelProperty(value="排序号")
    private Double orderby;

    /**
     * 描述
     */
    @ApiModelProperty(value="描述")
    private String des;

}
