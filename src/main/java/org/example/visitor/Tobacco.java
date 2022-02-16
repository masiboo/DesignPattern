package org.example.visitor;

class Tobacco implements Taxable {

    private double price;

    Tobacco(double item) {
        price = item;
    }

    public double taxableItem(Visitor visitor) {
        return visitor.taxCalculation(this);
    }

    public double getPrice() {
        return price;
    }

}
