package com.example.dachuang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dachuang.common.Result;
import com.example.dachuang.entity.Good;
import com.example.dachuang.service.GoodService;
import org.apache.ibatis.executor.ResultExtractor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodController {
    @Resource
    private GoodService goodService;
    @GetMapping
    public Result findAll()
    {
        return Result.success("查询所有商品成功",goodService.list());
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id)
    {
        return Result.success("查询商品成功",goodService.getById(id));
    }
    @GetMapping("/vip")
    public Result findByNotVip()
    {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("isVip",0);
        return Result.success("查询非Vip用户商品成功",goodService.list(queryWrapper));
    }
    @PutMapping
    public Result update(@RequestBody Good good)
    {
        return Result.success("商品信息更新成功",goodService.updateById(good));
    }
}
