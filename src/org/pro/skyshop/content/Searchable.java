package org.pro.skyshop.content;

public interface Searchable {
    String getSearchTerm();
    String getContentType();
    String getObjectName();
    default String StringRepresentation() {
        return String.format("%s - %s", getObjectName(), getContentType());
    }
}
