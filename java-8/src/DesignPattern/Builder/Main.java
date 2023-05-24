package DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .withId(23)
                .name("vu")
                .color("red")
                .price(1_000_000)
                .build();
        System.out.println(p);
    }
}
