package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.store.filter.SearchFilter;

public class Store {
    private List<Item> items;
    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            foundItems.add(item);
        }

        return foundItems;
    }
}
