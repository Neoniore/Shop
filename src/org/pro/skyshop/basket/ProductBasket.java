package org.pro.skyshop.basket;

import org.pro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private List<Product> products;

    public ProductBasket() {
        products = new ArrayList<>();
    }

    // добавление товара в корзину
    public void addGoods(Product product) {
        products.add(product);
    }

    // удаление товара из корзины
    public List<Product> deleteGoods(String productName) {
        List<Product> removedProducts = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(productName)) {
                removedProducts.add(product);
                iterator.remove();
            }
        }
        if (removedProducts.isEmpty()) {
            System.out.println("Список удаленных продуктов пуст");
        }
        return removedProducts;
    }

    // получение стоимости всей корзины
    public int costOfTheBasket() {
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
    public void printBasket() {
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
        System.out.printf("----------\nИтого: %d\n", costOfTheBasket());
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

    private boolean isBasketEmpty(List<Product> products) {
        for (Product product : products) {
            if (product != null) {
                return false;
            }
        }
        return true;
    }
}
