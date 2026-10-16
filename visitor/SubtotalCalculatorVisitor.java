package visitor;

import model.Laptop;
import model.Tablet;
import model.Television;
import model.TowerComputer;

public class SubtotalCalculatorVisitor implements Visitor {

    private double subtotal;

    public SubtotalCalculatorVisitor() {
        subtotal = 0;
    }

    public void visit(Tablet tablet) {
        subtotal = subtotal + tablet.getPrice();
    }

    public void visit(Laptop laptop) {
        subtotal = subtotal + laptop.getPrice();
    }

    public void visit(TowerComputer towerComputer) {
        subtotal = subtotal + towerComputer.getPrice();
    }

    public void visit(Television television) {
        subtotal = subtotal + television.getPrice();
    }

    public double getSubtotal() {
        return subtotal;
    }
}