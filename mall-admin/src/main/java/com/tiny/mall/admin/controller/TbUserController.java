package com.tiny.mall.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TbUserController {

    /**
     *
     * @return
     */
    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    
}
