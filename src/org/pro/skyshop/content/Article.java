package org.pro.skyshop.content;

public class Article implements Searchable{
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

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    //не понимаю смысла этого метода, может быть не так понял задание и его вообще не должно быть
    @Override
    public String getObjectName() {
        return name;
    }
}
