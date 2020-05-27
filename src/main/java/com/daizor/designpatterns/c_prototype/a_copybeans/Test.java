package com.daizor.designpatterns.c_prototype.a_copybeans;

import java.lang.reflect.InvocationTargetException;

/**
 * bean属性赋值
 *
 * @author Daizor
 * @date 2020/5/27 18:38:45
 */
public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User();
        user.setName("姓名");
        user.setAge(18);
        user.setAddress("地址");
        user.setIdCard("身份证号");
        User copy = (User) BeanUtils.copy(user);
        System.out.println(copy);
    }
}
