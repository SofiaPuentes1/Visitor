package visitor;

import model.Laptop;
import model.Tablet;
import model.Television;
import model.TowerComputer;

public interface Visitor {

    void visit(Tablet tablet);

    void visit(Laptop laptop);

    void visit(TowerComputer towerComputer);

    void visit(Television television);
}