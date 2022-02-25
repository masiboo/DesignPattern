package org.example.visitor;

import java.util.List;

public class ConcreteVisitor implements Visitor{

    public void visit(List<VisitingInterface> elements) {
        elements.forEach(VisitingInterface::iterate);
    }
}
