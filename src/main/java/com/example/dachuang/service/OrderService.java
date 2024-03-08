package com.example.dachuang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dachuang.entity.Order;
import com.example.dachuang.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> {
    @Resource
    private OrderMapper orderMapper;

    public Integer findIsVip(Integer userid)
    {
        return orderMapper.findIsVip(userid);
    }

    public Integer findByPrice(Integer userid)
    {
        return orderMapper.findByPrice(userid);
    }
}
