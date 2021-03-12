package com.example.firstmyapplication;

public class Goods {
    private String Name;
    private String tien;
    private int imageGoods;

    public Goods(String name, String tien, int imageGoods) {
        Name = name;
        this.tien = tien;
        this.imageGoods = imageGoods;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return Name;
    }

    public String getTien() {
        return tien;
    }

    public int getImageGoods() {
        return imageGoods;
    }
}
