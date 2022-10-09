package VisitorDesignPattern.visitable;

import VisitorDesignPattern.visitor.Visitor;

public interface Visitable {

    void accept(Visitor visitor);
}