package com.example.dachuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dachuang.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
