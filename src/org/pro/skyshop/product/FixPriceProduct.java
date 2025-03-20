package org.pro.skyshop.product;

public class FixPriceProduct extends Product {
    public static int FIX_PRICE = 50;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %d (фиксированная цена %d)", super.getName(), getPrice(), FIX_PRICE);
    }
}
