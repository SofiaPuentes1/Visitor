package visitor;

import model.Laptop;
import model.Tablet;
import model.Television;
import model.TowerComputer;

public class ShippingCalculatorVisitor implements Visitor {

    private double shippingCost;

    public ShippingCalculatorVisitor() {
        shippingCost = 0;
    }

    public void visit(Tablet tablet) {
        double percentage = (tablet.getWeight() / 100.0) * 2;
        double cost = tablet.getPrice() * percentage / 100;
        shippingCost = shippingCost + cost;
    }

    public void visit(Laptop laptop) {
        double percentage = (laptop.getWeight() / 100.0) * 2;
        double cost = laptop.getPrice() * percentage / 100;
        shippingCost = shippingCost + cost;
    }

    public void visit(TowerComputer towerComputer) {
        double percentage = (towerComputer.getWeight() / 100.0) * 2;
        double cost = towerComputer.getPrice() * percentage / 100;
        shippingCost = shippingCost + cost;
    }

    public void visit(Television television) {
        double percentage = (television.getWeight() / 100.0) * 2;
        double cost = television.getPrice() * percentage / 100;
        shippingCost = shippingCost + cost;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}