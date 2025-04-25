package org.pro.skyshop.product;

public class DiscountedProduct extends Product {
    private final int basicPrice;
    private final int precentageDiscount;

    public DiscountedProduct(String name, int basicPrice, int precentageDiscount) {
        super(name);
        if (basicPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        if (precentageDiscount < 0 || precentageDiscount > 100) {
            throw new IllegalArgumentException("Precentage discount must be between 0 and 100");
        }
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
