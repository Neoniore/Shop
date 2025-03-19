package org.pro.skyshop;

import org.pro.skyshop.product.DiscountedProduct;
import org.pro.skyshop.product.FixPriceProduct;
import org.pro.skyshop.product.SimpleProduct;
import org.pro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        ProductBasket pb = getProductBasket();

        pb.displayTheContentsOfTheBasket();

        //System.out.println("theCostOfTheBasket = " + pb.obtainingTheCostOfTheBasket());
        //System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"молоко\") = " + pb.checkingByTheNameOfTheProductInTheBasket("молоко"));
        //System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"краска\") = " + pb.checkingByTheNameOfTheProductInTheBasket("краска"));
        //pb.cleaningTheBasket();
        //pb.displayTheContentsOfTheBasket();
        //pb.obtainingTheCostOfTheBasket();
        //pb.checkingByTheNameOfTheProductInTheBasket("молоко");
    }

    private static ProductBasket getProductBasket() {
        SimpleProduct meat = new SimpleProduct("Мясо", 250);
        SimpleProduct milk = new SimpleProduct("Молоко", 100);
        SimpleProduct cheese = new SimpleProduct("Сыр", 150);
        SimpleProduct water = new SimpleProduct("Вода", 80);
        SimpleProduct bread = new SimpleProduct("Хлеб", 50);
        SimpleProduct butter = new SimpleProduct("Масло", 120);
        DiscountedProduct chocolate = new DiscountedProduct("Шоколад", 100, 10);
        FixPriceProduct pen = new FixPriceProduct("ручка");

        ProductBasket pb = new ProductBasket();
        pb.addingGoods(water);
        pb.addingGoods(bread);
        pb.addingGoods(meat);
        pb.addingGoods(chocolate);
        pb.addingGoods(pen);
        //pb.addingGoods(milk);
        //pb.addingGoods(cheese);
        //pb.addingGoods(butter);

        return pb;
    }
}
