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

}
