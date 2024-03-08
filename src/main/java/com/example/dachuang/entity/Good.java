package com.example.dachuang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("goods")
public class Good {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value = "good_img")
    private String goodImg;
    @TableField(value = "good_name")
    private String goodName;
    @TableField(value = "good_description")
    private String goodDescription;
    @TableField(value = "content")
    private String content;
    @TableField(value = "sale")
    private Integer sale;
    @TableField(value = "price")
    private Double price;
    @TableField(value = "isVip")
    private Integer isVip;
}
