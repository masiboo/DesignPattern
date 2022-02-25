package org.example.visitor;

import java.util.List;

public interface Visitor {
    void visit(List<VisitingInterface> element);
}
