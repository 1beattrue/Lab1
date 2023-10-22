package singleton.data;

import singleton.domain.Item;

import java.util.List;

interface ItemDao {
    void addItem(Item item);
    void deleteItem(Item item);
    List<Item> getItemList();
}
