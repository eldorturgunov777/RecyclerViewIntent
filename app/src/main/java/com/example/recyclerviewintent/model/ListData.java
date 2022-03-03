package com.example.recyclerviewintent.model;

/**
 * Created by Eldor Turgunov
 * Project: RecyclerView Intent
 * Date: 03.03.2022
 * Time: 10:01
 */

public class ListData {
    int image;
    String title;

    public ListData(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
