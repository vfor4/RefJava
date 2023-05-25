package DesignPattern.Iterator.Github;

import java.util.List;

public class TreasureChest {
    private final List<Item> items;

    public TreasureChest() {
        this.items = List.of(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poison"),
                new Item(ItemType.GUN, "Get on the ground"),
                new Item(ItemType.SWORD, "Im a ninja"),
                new Item(ItemType.GUN, "Black live matter"),
                new Item(ItemType.SWORD, "Blind hero"));
    }

    public Iterator<Item> getIterator(ItemType type){
        return new IteratorTreasure(this.items, type);
    }
}
