package DesignPattern.Visitor.Products;

import DesignPattern.Visitor.Visitable;
import DesignPattern.Visitor.Visitor;

public class Liquor implements Visitable {
    public String name = "champagne";
    public int price = 10;

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
