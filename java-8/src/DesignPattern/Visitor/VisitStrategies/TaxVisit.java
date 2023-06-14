package DesignPattern.Visitor.VisitStrategies;

import DesignPattern.Visitor.Products.Liquor;
import DesignPattern.Visitor.Products.Necessity;
import DesignPattern.Visitor.Products.Tobacco;
import DesignPattern.Visitor.Visitor;

public class TaxVisit implements Visitor {
    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("im tax visitor");
        return tobacco.price * 50/100 + tobacco.price;
    }

    @Override
    public double visit(Liquor liquor) {
        System.out.println("im tax visitor");
        return liquor.price * 80/100 + liquor.price;
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("im tax visitor");
        return necessity.price;
    }
}
