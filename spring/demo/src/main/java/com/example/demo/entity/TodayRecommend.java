package com.example.demo.entity;

import com.example.demo.entity.Product;

public class TodayRecommend extends Product {

    private String rname;
    private int rprice;

    private final int MAX = price.length;

    public TodayRecommend() {

        int randIdx = recommend();
        rname = Product.game[randIdx];
        rprice = Product.price[randIdx];

    }

    public int recommend() {
        return (int) (Math.random() * MAX);

    }
}
