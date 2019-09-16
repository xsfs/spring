package com.test.spring.OrikaMapper.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserBO {
    //这里最好用integer  考虑无初始值拷贝时 结果为0而非null
    private int id;
    private String name;
    private String password;
    private BigDecimal grades;
    private String email;
}
