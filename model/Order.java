package model;

import java.util.ArrayList;
import visitor.Visitor;

public class Order {

    private ArrayList<Product> products;
    private ArrayList<Integer> quantities;

    public Order() {
        products = new ArrayList<Product>();
        quantities = new ArrayList<Integer>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        products.add(product);
        quantities.add(quantity);
    }

    public void accept(Visitor visitor) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities.get(i);
            for (int j = 0; j < quantity; j++) {
                product.accept(visitor);
            }
        }
    }
}