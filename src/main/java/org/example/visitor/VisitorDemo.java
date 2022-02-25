package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {

    public static void main(String[] args) {
        ElementA elemA = new ElementA();
        ElementB elemB = new ElementB();
        List<VisitingInterface> list = new ArrayList<>();
        list.add(elemA);
        list.add(elemB);
        Visitor concreteVisitor = new ConcreteVisitor();
        concreteVisitor.visit(list);
    }
}
