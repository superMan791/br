package com.tech.biran.demo.br.demo.d.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tech.biran.common.br.common.core.config.mybatisplus.AESEncryptHandler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * bsc_dict_info
 * @author 
 */
@ApiModel(value="com.br.cloud.br.business.sk.model.entity.BscDictInfo数据字典")
@Data
@TableName(autoResultMap = true)
public class BscDictInfo implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 父节点id
     */
    @ApiModelProperty(value = "父节点id, 默认值: 0")
    private Long pid;

    /**
     * 类别
     */
    @TableField(typeHandler = AESEncryptHandler.class)
    @ApiModelProperty(value="父级字典编码")
    private String category;


    /**
     * 编码
     */
    @ApiModelProperty(value="字典编码")
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

    /**
     * 是否可用：1：可用，0：不可用
     */
    @ApiModelProperty(value="是否可用：1：可用，0：不可用")
    private Integer delflag;

    /**
     * 创建人id
     */
    @ApiModelProperty(value="创建人id")
    private String cucode;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    private String cuname;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime cdate;

    /**
     * 更新人id
     */
    @ApiModelProperty(value="更新人id")
    private String lucode;

    /**
     * 最后更新时间
     */
    @ApiModelProperty(value="最后更新时间")
    private LocalDateTime ldate;

    private static final long serialVersionUID = 1L;
}
