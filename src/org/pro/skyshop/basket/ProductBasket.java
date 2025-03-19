package org.pro.skyshop.basket;

import org.pro.skyshop.product.Product;

public class ProductBasket {
    private static final int CAPACITY_OF_BASKET = 5;
    private Product[] products;

    public ProductBasket() {
        products = new Product[CAPACITY_OF_BASKET];
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

        int specialProductsCount = 0;

        for (Product product : products) {
            System.out.println(product);
            if (product.isSpecial()) {
                specialProductsCount++;
            }
        }
        System.out.printf("----------\nИтого: %d\n", obtainingTheCostOfTheBasket());
        System.out.printf("\nСпециальных товаров: %d\n----------\n", specialProductsCount);
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
        products = new Product[CAPACITY_OF_BASKET];
    }


    private boolean isBasketFull(Product[] products) {
        for (Product product : products) {
            if (product == null) {
                return false;
            }
        }
        return true;
    }

    private boolean isBasketEmpty(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                return false;
            }
        }
        return true;
    }
}
