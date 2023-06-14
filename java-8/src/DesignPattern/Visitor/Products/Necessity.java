package DesignPattern.Visitor.Products;

import DesignPattern.Visitor.Visitable;
import DesignPattern.Visitor.Visitor;

public class Necessity implements Visitable {

    public String name = "milk";
    public int price = 2;

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
