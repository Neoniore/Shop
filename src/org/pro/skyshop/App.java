package org.pro.skyshop;

import org.pro.skyshop.basket.ProductBasket;
import org.pro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product meat = new Product("Мясо", 250);
        Product milk = new Product("Молоко", 100);
        Product cheese = new Product("Сыр", 150);
        Product water = new Product("Вода", 80);
        Product bread = new Product("Хлеб", 50);
        Product butter = new Product("Масло", 120);

        ProductBasket pb = new ProductBasket();
        pb.addingGoods(meat);
        pb.addingGoods(milk);
        pb.addingGoods(cheese);
        pb.addingGoods(water);
        pb.addingGoods(bread);
        //pb.addingGoods(butter);

        pb.displayTheContentsOfTheBasket();

        int theCostOfTheBasket = pb.obtainingTheCostOfTheBasket();
        System.out.println("theCostOfTheBasket = " + theCostOfTheBasket);

        System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"молоко\") = " + pb.checkingByTheNameOfTheProductInTheBasket("молоко"));
        System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"краска\") = " + pb.checkingByTheNameOfTheProductInTheBasket("краска"));

        pb.cleaningTheBasket();

        //pb.displayTheContentsOfTheBasket();
        //pb.obtainingTheCostOfTheBasket();
        //pb.checkingByTheNameOfTheProductInTheBasket("молоко");
    }
}
