package VisitorDesignPattern.visitor;

import VisitorDesignPattern.visitable.LargePackage;
import VisitorDesignPattern.visitable.MediumPackage;
import VisitorDesignPattern.visitable.SmallPackage;

public interface Visitor {

    public void visit(SmallPackage smallPackage);
    public void visit(MediumPackage mediumPackage);
    public void visit(LargePackage largePackage);

}
