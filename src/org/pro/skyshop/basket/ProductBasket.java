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
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
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
            theCostOfTheBasket += product.getPrice();
        }
        return theCostOfTheBasket;
    }

    // печать содержимого корзины
    public void displayTheContentsOfTheBasket() {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("В корзине пусто");
        }
        System.out.println("----------\nКорзина\n----------");
        for (Product product : products) {
            System.out.printf("%s: %d\n", product.getName(), product.getPrice());
        }
        System.out.printf("----------\nИтого: %d\n\n", obtainingTheCostOfTheBasket());
    }

    //проверка наличия товара в корзине по имени
    public boolean checkingByTheNameOfTheProductInTheBasket(String productName) {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("В корзине пусто");
        }
        boolean containsAProduct = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                containsAProduct = true;
                break;
            }
        }
        return containsAProduct;
    }

    //очистка корзины
    public void cleaningTheBasket() {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("Корзина уже пустая");
        }
        products = new Product[capacityOfTheBasket];
    }


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
