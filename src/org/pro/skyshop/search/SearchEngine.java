package org.pro.skyshop.search;

import org.pro.skyshop.exception.BestResultNotFound;

public class SearchEngine {
    Searchable[] searchables;

    public SearchEngine(int searchLimit) {
        searchables = new Searchable[searchLimit];
    }

    public void add(Searchable searchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
                break;
            }
        }
    }

    public String[] search(String searchTerm) {
        String[] foundObjects = new String[5];
        int indexFoundObjects = 0;
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                foundObjects[indexFoundObjects] = searchable.getStringRepresentation();
                indexFoundObjects++;
            }
            if (indexFoundObjects > 4) {
                break;
            }
        }
        return foundObjects;
    }

    public Searchable findSearchable(String search) {
        int numberOfOccurrences = 0;
        Searchable foundObject = null;
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().toLowerCase().contains(search.toLowerCase())) {
                String stringRepresentationSearchableObject = searchable.getSearchTerm().toLowerCase();
                int index = 0;
                int count = 0;
                while ((index = stringRepresentationSearchableObject.toLowerCase().indexOf(search.toLowerCase(), index)) != -1) {
                    count++;
                    if (count > numberOfOccurrences) {
                        foundObject = searchable;
                        numberOfOccurrences = count;
                    }
                    index += search.length();
                }

            }
        }
        if (foundObject == null) {
            throw new BestResultNotFound(String.format("Failed to find the word \"%s\" ", search));
        }
        return foundObject;
    }


}
