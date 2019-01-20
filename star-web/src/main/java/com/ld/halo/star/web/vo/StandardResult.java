package com.ld.halo.star.web.vo;

import lombok.Data;

@Data
public class StandardResult<T> {
    private int code;
    private T data;
}
