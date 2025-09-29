package com.Elecciones;

import java.util.Scanner;

public class Partido {
    private String name;
    private int share;

    public Partido(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getShare() {
        return share;
    }

    public void setShare(int share) {

        this.share = share;
    }
}
