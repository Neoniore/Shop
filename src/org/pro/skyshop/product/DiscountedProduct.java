package org.pro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basicPrice;
    private int precentageDiscount;

    DiscountedProduct(String name, int basicPrice, int precentageDiscount) {
        super(name);
        this.basicPrice = basicPrice;
        this.precentageDiscount = precentageDiscount;
    }

    @Override
    public int getPrice() {
        return basicPrice * precentageDiscount / 100;
    }
}
