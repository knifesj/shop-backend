package com.example.dachuang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dachuang.common.Result;
import com.example.dachuang.entity.Order;
import com.example.dachuang.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @PostMapping
    public Result save(@RequestBody Order order)
    {
        return Result.success("新增订单成功",orderService.save(order));
    }
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id)
    {
        return Result.success("根据id查询成功",orderService.getById(id));
    }
    @PutMapping
    public Result update(@RequestBody Order order)
    {
        return Result.success("订单状态更新成功",orderService.updateById(order));
    }
    @GetMapping()
    public Result findById(@RequestParam Integer id,@RequestParam String state)
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id",id);
        queryWrapper.eq("state",state);
        return Result.success("查询所有待付款订单成功",orderService.list(queryWrapper));
    }
    @GetMapping("/vip/{userid}")
    public Result findIsVip(@PathVariable Integer userid)
    {
        return Result.success("查询用户购买量成功",orderService.findIsVip(userid));
    }
    @GetMapping("/price/{userid")
    public Result findByPrice(@PathVariable Integer userid)
    {
        return Result.success("查询用户的购买总额成功",orderService.findByPrice(userid));
    }
}
