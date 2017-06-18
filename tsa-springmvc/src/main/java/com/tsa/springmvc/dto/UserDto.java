package com.tsa.springmvc.dto;

import com.tsa.springmvc.common.BaseDto;
import com.tsa.springmvc.dto.type.PhoneNumber;

import java.util.Date;

/**
 * Created by LS on 2017-6-17.
 */
public class UserDto extends BaseDto {

    private String name;
    private Integer age;
    private Date birthDay;
    /**
     * 将通过自定义Formatter转换器来转换，所以不重载toString方法
     */
    private PhoneNumber phoneNumber;

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
