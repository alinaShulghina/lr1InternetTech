package com.diit.piclib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by alin- on 11.09.2017.
 */
@Controller
public class PicController {
    @RequestMapping("/")
    public String getPicture(){
        return "categories";
    }
}
