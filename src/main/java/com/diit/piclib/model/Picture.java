package com.diit.piclib.model;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by alin- on 22.09.2017.
 */
public class Picture {
    private String name;
    private int categoryId;
    private LocalDate dateUploaded;
    private String author;
    private boolean isFavourite;

    public Picture(String name,int categoryId, LocalDate dateUploaded, String author, boolean isFavourite) {
        this.name = name;
        this.categoryId = categoryId;
        this.dateUploaded = dateUploaded;
        this.author = author;
        this.isFavourite = isFavourite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
