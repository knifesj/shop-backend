package com.example.dachuang.common;

import cn.hutool.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.ObjIntConsumer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(String msg,Object data)
    {
        return new Result(HttpStatus.HTTP_OK,msg,data);
    }
    public static Result msg(Integer code,String msg)
    {
        return new Result(code,msg,null);
    }
}
