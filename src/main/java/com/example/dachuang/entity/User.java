package com.example.dachuang.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;


@Data
@TableName("t_user")
public class User extends Model<User> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String avatar;
    @TableField(value = "isVip")
    private Integer isVip;
    @TableField(value = "address")
    private String address;
    @TableField(value = "account")
    private Integer account;
}