package model;

import visitor.Visitor;

public class Laptop implements Product {

    private String name;
    private double price;
    private double weight;

    public Laptop(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}