package DesignPattern.Builder;

import java.util.Locale;

public class Product {
    private int id;
    private String name;
    private String color;
    private long price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static final class Builder{
        private final Product product;
        public Builder(){
           this.product = new Product();
        }

        public Builder withId(int id){
           this.product.id = id;
           return this;
        }
        public Builder name(String name){
            this.product.name = name;
            return this;
        }
        public Builder color(String color){
            this.product.color = color;
            return this;
        }
        public Builder price(long price){
            this.product.price = price;
            return this;
        }

        public Product build(){
            return this.product;
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
