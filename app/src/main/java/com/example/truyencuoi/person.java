package com.example.truyencuoi;

import androidx.recyclerview.widget.RecyclerView;

public class person{
    private int resuorid;
    private String name;

    public person(int resuorid, String name) {
        this.resuorid = resuorid;
        this.name = name;
    }

    public int getResuorid() {
        return resuorid;
    }

    public void setResuorid(int resuorid) {
        this.resuorid = resuorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
