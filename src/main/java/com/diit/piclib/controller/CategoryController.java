package com.diit.piclib.controller;

import com.diit.piclib.data.CategoryRepository;
import com.diit.piclib.data.PicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 11.09.2017.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private PicRepository picRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        modelMap.put("categories", categoryRepository.getAllCategories());
        return "categories";
    }

    @RequestMapping("/categories/{id}")
    public String category(@PathVariable int id, ModelMap modelMap){
        modelMap.put("category",categoryRepository.findCategoryById(id));
        modelMap.put("pictures",picRepository.getPicturesByCategoryId(id));
        return "category";
    }
}
