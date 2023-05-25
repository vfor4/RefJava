package DesignPattern.Iterator.Github;

import java.util.List;

public class IteratorTreasure implements Iterator<Item>{
    private int idx;
    private final List<Item> lists;
    private final ItemType itemType;
   public IteratorTreasure(List<Item> lists, ItemType type){
       this.idx = -1;
       this.lists = lists;
       this.itemType = type;
   }
    @Override
    public boolean hasNext() {
        return this.getNextIdx() != -1;
    }

    @Override
    public Item next() {
        return this.lists.get(this.idx);
    }

    private int getNextIdx(){
      while(true){
          this.idx++;
          if(idx >= this.lists.size()){
              this.idx = -1;
              break;
          }
          ItemType tempType = this.lists.get(idx).getType();
          if(itemType.equals(ItemType.ANY) || tempType.equals(this.itemType)) break;
      }
      return idx;
    }
}
