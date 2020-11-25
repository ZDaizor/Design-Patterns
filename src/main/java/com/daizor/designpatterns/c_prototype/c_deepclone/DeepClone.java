package com.daizor.designpatterns.c_prototype.c_deepclone;

import lombok.Data;

import java.io.*;

/**
 * 序列化深克隆
 *
 * @author Daizor
 * @date 2020/5/28 0:40:46
 */
@Data
public class DeepClone {
    private String name;
    private Integer age;

    /**
     * 序列化实现对象克隆
     *
     * @return
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
