package com.ld.halo.star.web.controller;

import com.ld.halo.star.web.vo.StandardResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController("user")
public class UserController {
    @GetMapping("/list")
    public StandardResult list() {
        return null;
    }
}
