package com.company;

public class TV extends Product {

    private Brand brand;

    public TV(Brand brand) {
        super(brand);
    }

    @Override
    public MainBrand getBrand(){
        return new Brand("Pesho");
    }

    @Override
    public String toString() {
        return this.getBrand().getName();
    }
}
