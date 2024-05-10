package com.tiac;

public class Movie {
    public static final int CATEGORY_CHILDRENS = 2;
    public static final int CATEGORY_TRILLER = 0;
    public static final int CATEGORY_NEW_RELEASE = 1;

    enum MovieType {

    }

    private String title;
    private int category;

    public Movie(String title, int category) {
        this.title = title;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int arg) {
        category = arg;
    }

    public String getTitle() {
        return title;
    }

}
