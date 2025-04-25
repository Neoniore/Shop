package org.pro.skyshop.basket;

import org.pro.skyshop.product.Product;

import java.util.ArrayList;

public class ProductBasket {
    private ArrayList<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    // добавление товара в корзину
    public void addingGoods(Product product) {
        products.add(product);
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

        int specialProductsCount = 0;

        for (Product product : products) {
            System.out.println(product);
            if (product.isSpecial()) {
                specialProductsCount++;
            }
        }
        System.out.printf("----------\nИтого: %d\n", obtainingTheCostOfTheBasket());
        System.out.printf("Специальных товаров: %d\n----------\n", specialProductsCount);
    }

    //проверка наличия товара в корзине по имени
    public boolean checkingByTheNameOfTheProductInTheBasket(String productName) {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("В корзине пусто");
        }
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    //очистка корзины
    public void cleaningTheBasket() {
        if (isBasketEmpty(products)) {
            throw new IllegalStateException("Корзина уже пустая");
        }
        products.clear();
    }


    private boolean isBasketFull(Product[] products) {
        for (Product product : products) {
            if (product == null) {
                return false;
            }
        }
        return true;
    }

    private boolean isBasketEmpty(ArrayList<Product> products) {
        for (Product product : products) {
            if (product != null) {
                return false;
            }
        }
        return true;
    }
}
