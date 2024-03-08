package com.example.dachuang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("order_info")
public class Order {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "good_name")
    private String goodName;
    @TableField(value = "good_img")
    private String goodImg;
    @TableField(value = "good_description")
    private String goodDescription;
    @TableField(value = "totalPrice")
    private Double totalPrice;
    @TableField(value = "user_id")
    private Integer userId;
    @TableField(value = "state")
    private String state;
    @TableField(value = "create_time")
    private String createTime;
    @TableField(value = "product_id")
    private Integer productId;
    @TableField(value = "nums")
    private Double nums;
}
