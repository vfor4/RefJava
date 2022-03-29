package pakageA.EnumDemo;

public enum Apple {
    Jonathan(1), GoldenDel(2), RedDel(3), Winesap(4), Cortland(5);

    private int price;

    Apple(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}
