package org.pro.skyshop.search;

import org.pro.skyshop.exception.BestResultNotFound;

import java.util.ArrayList;

public class SearchEngine {
    ArrayList<Searchable> searchables;

    public SearchEngine() {
        searchables = new ArrayList<>();
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    public ArrayList<String> search(String searchTerm) {
        ArrayList<String> foundObjects = new ArrayList<>();
        for (Searchable searchable : searchables) {
            if (searchable.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                foundObjects.add(searchable.getStringRepresentation());
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
