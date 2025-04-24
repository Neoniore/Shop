package org.pro.skyshop;

import org.pro.skyshop.content.Article;
import org.pro.skyshop.product.DiscountedProduct;
import org.pro.skyshop.product.FixPriceProduct;
import org.pro.skyshop.product.SimpleProduct;
import org.pro.skyshop.basket.ProductBasket;
import org.pro.skyshop.search.SearchEngine;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //ProductBasket pb = getProductBasket();
        //pb.displayTheContentsOfTheBasket();

        SearchEngine se = null;
        try {
            se = getSearchEngineElements();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException (e);
        }

        System.out.println(Arrays.toString(se.search("мясо")));


        //System.out.println("theCostOfTheBasket = " + pb.obtainingTheCostOfTheBasket());
        //System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"молоко\") = " + pb.checkingByTheNameOfTheProductInTheBasket("молоко"));
        //System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"краска\") = " + pb.checkingByTheNameOfTheProductInTheBasket("краска"));
        //pb.cleaningTheBasket();
        //pb.displayTheContentsOfTheBasket();
        //pb.obtainingTheCostOfTheBasket();
        //pb.checkingByTheNameOfTheProductInTheBasket("молоко");
    }

    private static SearchEngine getSearchEngineElements() {
        SimpleProduct meat = new SimpleProduct("Мясо", 250);
        SimpleProduct milk = new SimpleProduct("Молоко", 100);
        SimpleProduct cheese = new SimpleProduct("Сыр", 150);
        SimpleProduct water = new SimpleProduct("Вода", 80);
        SimpleProduct bread = new SimpleProduct("Хлеб", 50);
        SimpleProduct butter = new SimpleProduct("Масло", 120);
        DiscountedProduct chocolate = new DiscountedProduct("Шоколад", 100, 15);
        Article milkArticle = new Article("Молоко: польза для здоровья и как избежать подделок", "Как отличить натуральное молоко от подделки и почему оно важно для вашего рациона.");
        Article meatArticle = new Article("Мясо: как выбрать качественный продукт и сохранить его свежесть", "Советы по выбору свежего мяса и правильному хранению для сохранения вкуса и пользы.");

        SearchEngine se = new SearchEngine(9);
        se.add(meat);
        se.add(milk);
        se.add(cheese);
        se.add(water);
        se.add(bread);
        se.add(butter);
        se.add(chocolate);
        se.add(milkArticle);
        se.add(meatArticle);

        return se;
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
