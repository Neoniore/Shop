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
        return basicPrice - basicPrice * precentageDiscount / 100;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %d (скидка %d%%)", super.getName(), getPrice(), precentageDiscount);
    }
}
