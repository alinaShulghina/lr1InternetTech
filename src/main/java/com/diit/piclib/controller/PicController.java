package com.diit.piclib.controller;

import com.diit.piclib.data.PicRepository;
import com.diit.piclib.model.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by alin- on 11.09.2017.
 */
@Controller
public class PicController {
    @Autowired
    private PicRepository picRepository;

    @RequestMapping("/")
    public String getPicture(ModelMap map) {
        map.put("all_pictures", picRepository.getAllPictures());
        return "home";
    }

    @RequestMapping("/pic/{name}")
    public String picDetails(@PathVariable String name, ModelMap modelMap) {
        modelMap.put("pic", picRepository.findPicByName(name));
        return "pic-details";
    }
}
