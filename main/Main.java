package main;

import model.Laptop;
import model.Order;
import model.Tablet;
import model.Television;
import model.TowerComputer;
import visitor.ShippingCalculatorVisitor;
import visitor.SubtotalCalculatorVisitor;

public class Main {

    public static void main(String[] args) {
        Tablet tablet = new Tablet("Tablet", 200, 250);
        Laptop laptop = new Laptop("Laptop", 400, 1000);
        TowerComputer tower = new TowerComputer("Tower computer", 600, 6000);
        Television television = new Television("Television", 300, 4000);

        Order order = new Order();
        order.addProduct(tablet, 2);
        order.addProduct(laptop, 1);
        order.addProduct(tower, 1);
        order.addProduct(television, 1);

        SubtotalCalculatorVisitor subtotalVisitor = new SubtotalCalculatorVisitor();
        order.accept(subtotalVisitor);
        double subtotal = subtotalVisitor.getSubtotal();

        ShippingCalculatorVisitor shippingVisitor = new ShippingCalculatorVisitor();
        order.accept(shippingVisitor);
        double shipping = shippingVisitor.getShippingCost();

        double total = subtotal + shipping;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Shipping: $" + shipping);
        System.out.println("Total: $" + total);

        Order emptyOrder = new Order();
        SubtotalCalculatorVisitor emptySubtotal = new SubtotalCalculatorVisitor();
        ShippingCalculatorVisitor emptyShipping = new ShippingCalculatorVisitor();
        emptyOrder.accept(emptySubtotal);
        emptyOrder.accept(emptyShipping);

        System.out.println("Empty order subtotal: $" + emptySubtotal.getSubtotal());
        System.out.println("Empty order shipping: $" + emptyShipping.getShippingCost());
        System.out.println("Empty order total: $" + (emptySubtotal.getSubtotal() + emptyShipping.getShippingCost()));
    }
}