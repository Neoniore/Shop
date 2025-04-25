package org.pro.skyshop;

import org.pro.skyshop.content.Article;
import org.pro.skyshop.product.DiscountedProduct;
import org.pro.skyshop.product.FixPriceProduct;
import org.pro.skyshop.product.SimpleProduct;
import org.pro.skyshop.basket.ProductBasket;
import org.pro.skyshop.search.SearchEngine;

public class App {
    public static void main(String[] args) {
        ProductBasket pb = getProductBasket();
        pb.printBasket();

//        System.out.println("theCostOfTheBasket = " + pb.costOfTheBasket());
//        System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"молоко\") = " + pb.checkingByTheNameOfTheProductInTheBasket("молоко"));
//        System.out.println("pb.checkingByTheNameOfTheProductInTheBasket(\"краска\") = " + pb.checkingByTheNameOfTheProductInTheBasket("краска"));
//        pb.cleaningTheBasket();
//        pb.displayTheContentsOfTheBasket();
//        pb.costOfTheBasket();
//        pb.checkingByTheNameOfTheProductInTheBasket("молоко");
        System.out.println("pb.deleteGoods(\"Вода\") = " + pb.deleteGoods("Вода"));
        pb.printBasket();
        System.out.println("pb.deleteGoods(\"Вода\") = " + pb.deleteGoods("Вода"));
        pb.printBasket();


//        SearchEngine se = null;
//        try {
//            se = getSearchEngineElements();
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException (e);
//        }
//
//        System.out.println(Arrays.toString(se.search("мясо")));
//
//
//        try {
//            System.out.println("\nse.findSearchable() = " + se.findSearchable("молоко"));
//            System.out.println("\nse.findSearchable() = " + se.findSearchable("ffff"));
//        } catch (BestResultNotFound e) {
//            throw new RuntimeException(e);
//        }
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
        pb.addGoods(water);
        pb.addGoods(bread);
        pb.addGoods(meat);
        pb.addGoods(chocolate);
        pb.addGoods(pen);
        pb.addGoods(milk);
        pb.addGoods(cheese);
        pb.addGoods(butter);
        pb.addGoods(new SimpleProduct("Вода", 100));

        return pb;
    }
}
