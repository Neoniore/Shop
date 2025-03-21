package org.pro.skyshop.product;

import org.pro.skyshop.content.Searchable;

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

    //не понимаю смысла этого метода, может быть не так понял задание и его вообще не должно быть
    @Override
    public String getObjectName() {
        return getName();
    }
}
