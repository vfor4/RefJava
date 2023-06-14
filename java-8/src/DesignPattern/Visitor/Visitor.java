package DesignPattern.Visitor;

import DesignPattern.Visitor.Products.Liquor;
import DesignPattern.Visitor.Products.Necessity;
import DesignPattern.Visitor.Products.Tobacco;

public interface Visitor {
    double visit(Tobacco tobacco);
    double visit(Liquor liquor);
    double visit(Necessity necessity);
}
