package org.pro.skyshop;

import org.pro.skyshop.product.SimpleProduct;
import org.pro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        SimpleProduct meat = new SimpleProduct("Мясо", 250);
        SimpleProduct milk = new SimpleProduct("Молоко", 100);
        SimpleProduct cheese = new SimpleProduct("Сыр", 150);
        SimpleProduct water = new SimpleProduct("Вода", 80);
        SimpleProduct bread = new SimpleProduct("Хлеб", 50);
        SimpleProduct butter = new SimpleProduct("Масло", 120);

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
