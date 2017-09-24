package com.diit.piclib.data;

import com.diit.piclib.model.Picture;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alin- on 23.09.2017.
 */
@Component
public class PicRepository {
    private static final List<Picture> ALL_PICTURES = Arrays.asList(
            new Picture("dveristenapoltsvet",1, LocalDate.of(2015, 10, 30), "Ben Jakuben", true),
            new Picture("masseffecandrome",2, LocalDate.of(2015, 9, 15), "Craig Dennis", false),
            new Picture("germaniyabavariyalakeobersee",3, LocalDate.of(2015, 2, 13), "Ada Lovelace", true),
            new Picture("snezhinkikristallysnegzima",1, LocalDate.of(2015, 2, 13), "Grace Hopper", false),
            new Picture("sshagorodniuiorkvechernochogni",3, LocalDate.of(2015, 8, 23), "Marissa Mayer", true)
    );

    public Picture findPicByName(String name) {
        return ALL_PICTURES.stream().filter(s->s.getName().equals(name)).findFirst().get();
        /*for (Picture p : ALL_PICTURES) {
            if (p.getName().equals(name)) return p;
        }
        return null;
        */
    }

    public List<Picture> getAllPictures() {
        return ALL_PICTURES;
    }
    public List<Picture> getPicturesByCategoryId(int id){
        return ALL_PICTURES.stream().filter(p->p.getCategoryId() == id).collect(Collectors.toList());
    }
}
