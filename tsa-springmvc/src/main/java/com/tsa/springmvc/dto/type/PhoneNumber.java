package com.tsa.springmvc.dto.type;

/**
 * Created by LS on 2017-6-18.
 */
public class PhoneNumber {
    public String value;

    public PhoneNumber() {

    }

    public PhoneNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
