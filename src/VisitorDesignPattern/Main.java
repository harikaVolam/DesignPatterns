package VisitorDesignPattern;

import VisitorDesignPattern.visitable.LargePackage;
import VisitorDesignPattern.visitable.MediumPackage;
import VisitorDesignPattern.visitable.SmallPackage;
import VisitorDesignPattern.visitable.Visitable;
import VisitorDesignPattern.visitor.PackageVisitor;
import java.util.ArrayList;
import java.util.List;
//https://medium.com/javarevisited/how-to-implement-visitor-design-pattern-using-java-99b6fcdd48ef
public class Main {

    public static double calculateCost(List<Visitable> packages){
        PackageVisitor packageVisitor= new PackageVisitor();
        for (Visitable items:packages) {
            items.accept(packageVisitor);
        }
        return packageVisitor.getTotalCost();

    }


    public static void main(String[] args) {

        List<Visitable> packages= new ArrayList<>();
        packages.add(new SmallPackage("SMALL",10));
        packages.add(new MediumPackage("MEDIUM",20));
        packages.add(new LargePackage("LARGE",30));
        System.out.println("Total Checkout Cost:-"+calculateCost(packages));



    }
}