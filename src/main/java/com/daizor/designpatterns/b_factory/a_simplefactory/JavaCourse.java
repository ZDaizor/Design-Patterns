package com.daizor.designpatterns.b_factory.a_simplefactory;

/**
 * JAVA课程
 *
 * @author Daizor
 * @date 2020/5/25 16:24:36
 */
public class JavaCourse implements ICourse {
    private String name = "java";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
