package com.example.dachuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dachuang.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select SUM(nums) from order_info where user_id = #{userid} and state = '待收货'")
    Integer findIsVip(Integer userid);

    @Select("select sum(totalPrice) from order_info where user_id = #{userod} and state = '待收货'")
    Integer findByPrice(Integer userid);
}
