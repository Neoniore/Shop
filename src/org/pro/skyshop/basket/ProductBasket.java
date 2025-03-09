package org.pro.skyshop.basket;

import org.pro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private static long id;
    private static final int capacityOfTheBasket = 5; // объем корзины
    private Product[] products;

    public ProductBasket() {
        id++;
        products = new Product[capacityOfTheBasket];
    }

    // добавление товара в корзину
    public void addingGoods(Product product) {
        if (isBasketFull(products)) {
            throw new IllegalStateException("Невозможно добавить продукт");
        }
        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] == null) {
                products[i] = product;
            }
        }
    }

    // получение стоимости всей корзины
    public int obtainingTheCostOfTheBasket() {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("Корзина пуста, невозможно рассчитать сумму");
        }
        int theCostOfTheBasket = 0;
        for (Product product : products) {
            theCostOfTheBasket =+ product.getPrice();
        }
        return theCostOfTheBasket;
    }

    // печать содержимого корзины


    private boolean isBasketFull(Product[] products) {
        return products != null && products[capacityOfTheBasket - 1] != null;
    }

    private boolean isBasketEmpty(Product[] products) {
        boolean isEmpty = true;
        for (Product product : products) {
            if (product != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }
}
