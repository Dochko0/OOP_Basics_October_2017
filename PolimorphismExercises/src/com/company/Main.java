package com.company;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV(new Brand("Sony"));
        MainBrand br = tv.getBrand();
        br = new MainBrand("Stamat");
        System.out.println(tv);

    }
}
