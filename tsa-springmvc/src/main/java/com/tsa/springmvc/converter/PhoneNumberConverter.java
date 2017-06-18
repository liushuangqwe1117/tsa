package com.tsa.springmvc.converter;

import com.tsa.springmvc.dto.type.PhoneNumber;

import java.beans.PropertyEditorSupport;

/**
 * Created by LS on 2017-6-18.
 */
public class PhoneNumberConverter extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Object val = getValue();
        if(val != null && val instanceof  PhoneNumber) {
            return ((PhoneNumber)val).getValue();
        }
        return "";
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if(text != null) {
            this.setValue(new PhoneNumber(text));
        }
    }
}
