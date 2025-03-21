package org.pro.skyshop.content;

public class Article {
    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n", name, text);
    }
}
