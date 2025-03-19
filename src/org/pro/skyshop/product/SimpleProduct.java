package org.pro.skyshop.product;

public class SimpleProduct extends Product {
    int price;

    public SimpleProduct(String name,int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", super.getName(), getPrice());
    }
    }
