package DesignPattern.Visitor.Products;

import DesignPattern.Visitor.Visitable;
import DesignPattern.Visitor.Visitor;

public class Tobacco implements Visitable {
    public String name = "hybrid";
    public int price = 5;

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
