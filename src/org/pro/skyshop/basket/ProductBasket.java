package org.pro.skyshop.basket;

import org.pro.skyshop.product.Product;

public class ProductBasket {
    private static long id;
    private static final int volumeOfTheBasket = 5; // объем корзины
    private Product[] products;

    public ProductBasket() {
        id++;
        products = new Product[volumeOfTheBasket];
    }

    public void addingGoods(Product product) {

    }

    private boolean isBasketFull(Product[] products) {
        return products != null && products[volumeOfTheBasket - 1] != null;
    }
}
