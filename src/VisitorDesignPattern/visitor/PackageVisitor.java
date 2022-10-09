package VisitorDesignPattern.visitor;

import VisitorDesignPattern.visitable.LargePackage;
import VisitorDesignPattern.visitable.MediumPackage;
import VisitorDesignPattern.visitable.SmallPackage;

public class PackageVisitor implements Visitor{

    private double totalCost;
    @Override
    public void visit(SmallPackage smallPackage) {

        totalCost+=smallPackage.getPrice();
    }

    @Override
    public void visit(MediumPackage mediumPackage) {
        totalCost+=mediumPackage.getPrice();
    }

    @Override
    public void visit(LargePackage largePackage) {
        totalCost+=largePackage.getPrice();
    }


    public double getTotalCost() {
        return totalCost;
    }
}
