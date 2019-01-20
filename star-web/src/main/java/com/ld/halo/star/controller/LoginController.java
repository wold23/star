package com.ld.halo.star.controller;

import com.google.common.collect.Maps;
import com.ld.halo.star.query.LoginQuery;
import com.ld.halo.star.vo.StandardResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @PostMapping("/user/login")
    public StandardResult<Map> login(@RequestBody LoginQuery query){
        StandardResult<Map> standardResult = new StandardResult<>();
        standardResult.setCode(20000);
        HashMap<Object, Object> data = Maps.newHashMap();
        data.put("token",query.getUsername());
        standardResult.setData(data);

        return standardResult;
    }
}
