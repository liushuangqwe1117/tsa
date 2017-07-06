package com.tsa.springmvc.controller;

import com.tsa.springmvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LS on 2017-6-17.
 */
@Controller
@RequestMapping("/returntype")
public class ReturnTypeConverterController {

    @RequestMapping(value = "/responseBody",
            consumes = {"application/json; charset=UTF-8"},
            produces = {"application/json; charset=UTF-8"})
    @ResponseBody
    public String responseBody(UserDto userDto){
        String smsCode = "342923";
        return smsCode;
    }
}
