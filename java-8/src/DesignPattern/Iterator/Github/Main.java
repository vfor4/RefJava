package DesignPattern.Iterator.Github;

public class Main {

    public static void main(String[] args) {

        TreasureChest chest = new TreasureChest();

//        Iterator<Item> iterator = chest.getIterator(ItemType.POTION);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Iterator<Item> iterator2 = chest.getIterator(ItemType.ANY);
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        Iterator<Item> iterator3 = chest.getIterator(ItemType.GUN);
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
}
