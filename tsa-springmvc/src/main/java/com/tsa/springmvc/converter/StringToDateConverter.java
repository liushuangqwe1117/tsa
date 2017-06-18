package com.tsa.springmvc.converter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LS on 2017-6-17.
 */
public class StringToDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if(StringUtils.isBlank(s))return null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(s.trim());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
