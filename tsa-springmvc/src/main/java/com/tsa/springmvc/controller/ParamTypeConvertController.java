package com.tsa.springmvc.controller;

import com.tsa.springmvc.common.ProjectConstants;
import com.tsa.springmvc.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by LS on 2017-6-17.
 */

@Controller
@RequestMapping("/paramtype")
public class ParamTypeConvertController {

    public static final String REDIRECT = "redirect:";

    public static final String USER_ADD_PATH = "user/userAdd";

    @RequestMapping("/edit")
    public String edit(Model model, UserDto user) {
        model.addAttribute("user",user);
        return USER_ADD_PATH;
    }


    @RequestMapping("/save")
    public String save(Model model, UserDto user,RedirectAttributes redirectAttrs) {
        System.out.println("user info:" + user);
        /**
         * 此处为重定向时将提示信息带人到重定向页面
         */
        redirectAttrs.addFlashAttribute(ProjectConstants.PAGE_TIP_MESSAGE_CODE,"PhoneNumber注入成功：" + user.toString());

        return REDIRECT + "/tcc/edit";
    }

}
