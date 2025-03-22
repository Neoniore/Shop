package org.pro.skyshop.content;

import org.pro.skyshop.search.Searchable;

public class Article implements Searchable {
    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
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

    @Override
    public String getObjectName() {
        return getName();
    }
}
