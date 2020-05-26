package com.ze;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author kz
 * @create 2020-05-25 15:17
 * @exception
 */
@ConfigurationProperties(prefix = "spring.ze")
public class ZeProperties {

    private String name;
    private Integer age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "ZeProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
