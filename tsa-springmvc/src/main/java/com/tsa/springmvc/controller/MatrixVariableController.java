package com.tsa.springmvc.controller;

import com.tsa.springmvc.common.ProjectConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 *
 *
 * 参考：
 * http://lucky16.iteye.com/blog/1901435
 * http://jinnianshilongnian.iteye.com/blog/1872760
 *
 * Created by LS on 2017-6-18.
 *
 */
@Controller
@RequestMapping("/matrixvar")
public class MatrixVariableController {

    /**
     * 访问地址：http://localhost:8080/info/44/pets/55;q=22,33;s=23
     *
     *
     * @param model
     * @param matrixVars
     * @param petMatrixVars
     * @return
     */
    @RequestMapping("/info/{ownerId}/pets/{petId}")
    public String info(Model model,
                       @PathVariable("ownerId")String ownerId,
                       @PathVariable("petId")String petId,
                       @MatrixVariable(pathVar = "ownerId") Map<String, String> ownerMatrixVars,
                       @MatrixVariable Map<String, String> matrixVars,
                       @MatrixVariable(pathVar = "petId") Map<String, String> petMatrixVars){
        System.out.println("ownerId：" + ownerId);
        System.out.println("petId：" + petId);
        System.out.println("ownerMatrixVars:"  + ownerMatrixVars);
        System.out.println("matrixVars:"  + matrixVars);
        System.out.println("petMatrixVars:" + petMatrixVars);
        model.addAttribute(ProjectConstants.PAGE_TIP_MESSAGE_CODE,matrixVars);
        return ProjectConstants.COMMON_SUCCESS_PAGE_PATH;
    }
}
