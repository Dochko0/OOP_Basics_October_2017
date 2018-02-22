package com.company;

public abstract class Product {
    private MainBrand brand;

    public Product(MainBrand brand){
        this.setBrand(brand);
    }

    public MainBrand getBrand(){
        return this.brand;
    }

    private void setBrand(MainBrand brand) {
        this.brand=brand;
    }

}
