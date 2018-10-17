package com.sell.enums;

import lombok.Getter;

/**
 * @Auther: SuperJ
 * @Date: 2018/10/17 23:12
 * @Description:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    IP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
