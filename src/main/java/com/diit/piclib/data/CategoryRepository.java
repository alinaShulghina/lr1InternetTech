package com.diit.piclib.data;

import com.diit.piclib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alin- on 24.09.2017.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Nature"),
            new Category(2,"Things"),
            new Category(3,"City"),
            new Category(4,"Interier")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findCategoryById(int id){
        for(Category c: ALL_CATEGORIES){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
