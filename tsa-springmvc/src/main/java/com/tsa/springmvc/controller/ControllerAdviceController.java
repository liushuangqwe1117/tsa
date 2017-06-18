package com.tsa.springmvc.controller;

import com.tsa.springmvc.converter.PhoneNumberConverter;
import com.tsa.springmvc.dto.type.PhoneNumber;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by LS on 2017-6-18.
 */
@ControllerAdvice
public class ControllerAdviceController {
    @InitBinder
    public void  initBinder(WebDataBinder binder, WebRequest webRequest) {
        binder.registerCustomEditor(PhoneNumber.class, new PhoneNumberConverter());
    }
}
