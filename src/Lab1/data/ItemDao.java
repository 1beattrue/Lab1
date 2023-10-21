package Lab1.data;

import Lab1.model.Item;

import java.util.List;

interface ItemDao {
    void addItem(Item item);
    void deleteItem(Item item);
    List<Item> getItemList();
}
