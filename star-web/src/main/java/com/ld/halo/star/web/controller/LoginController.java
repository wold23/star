package com.ld.halo.star.web.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ld.halo.star.web.query.LoginQuery;
import com.ld.halo.star.web.vo.StandardResult;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/user/info")
    public StandardResult<Map> userInfo(){
        StandardResult<Map> standardResult = new StandardResult<>();
        standardResult.setCode(20000);
        HashMap<Object, Object> data = Maps.newHashMap();
        data.put("roles", Lists.newArrayList("admin"));
        data.put("name", "admin");
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        standardResult.setData(data);

        return standardResult;
    }


    @PostMapping("/user/logout")
    public StandardResult<Map> logout(){
        StandardResult<Map> standardResult = new StandardResult<>();
        standardResult.setCode(20000);
        return standardResult;
    }
}
