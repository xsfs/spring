package com.test.spring;

import com.test.spring.model.UserBO;
import com.test.spring.model.UserDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.math.BigDecimal;

public class OrikaTest {
    //拷贝bean对象
    private static MapperFactory mapper=new DefaultMapperFactory.Builder().build();

    public static void main(String args[]){
        UserBO userBO=new UserBO();
        userBO.setId(1);
        userBO.setName("zzh");
        userBO.setPassword("123456");
        userBO.setGrades(new BigDecimal(99));
        userBO.setEmail("xxx@qq.com");
        UserDTO userDTO=mapper.getMapperFacade().map(userBO,UserDTO.class);
        System.out.println(userDTO);
        mapper.classMap(UserBO.class,UserDTO.class)
                .field("password","password1")
                .field("grades","grades1")
                .field("email","email1")
                .byDefault()
                .register();
        UserDTO userDTO1=mapper.getMapperFacade().map(userBO,UserDTO.class);
        System.out.println(userDTO1);
        userDTO1.setName("test");
        UserBO userBO1=mapper.getMapperFacade().map(userDTO1,UserBO.class);
        System.out.println(userBO1);
    }
}
