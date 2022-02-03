package com.example.demo.utility.product;

public class TodayRecommend extends Product{

    private String rname;
    private int rprice;

    private final int MAX = price().length;
    private final int MIN = 1;
    private int range = MAX - MIN + 1;
    private final int RECOMMEND = 3;

    public TodayRecommend() {

        int randIdx = recommend();

        rname = Product.game()[randIdx];
        rprice = Product.price()[randIdx];

    }


    public int recommend() {
        return (int) (Math.random() * range + MIN);

    }
}
