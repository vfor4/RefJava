package DesignPattern.Visitor;

import DesignPattern.Visitor.Products.Liquor;
import DesignPattern.Visitor.Products.Necessity;
import DesignPattern.Visitor.Products.Tobacco;
import DesignPattern.Visitor.VisitStrategies.TaxVisit;

public class Main {
    public static void main(String[] args) {
        Tobacco hybrid  = new Tobacco();
        Liquor champagne = new Liquor();
        Necessity milk = new Necessity();

        Visitor taxVisit = new TaxVisit();
        System.out.println(hybrid.accept(taxVisit));
        System.out.println(champagne.accept(taxVisit));
        System.out.println(milk.accept(taxVisit));

    }
}
