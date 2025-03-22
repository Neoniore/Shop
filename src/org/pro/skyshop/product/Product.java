package org.pro.skyshop.product;

import org.pro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();
    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return  getName();
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getObjectName() {
        return getName();
    }
}
