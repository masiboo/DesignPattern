package org.example.visitor;

class Necessity implements Taxable {

    private double price;

    Necessity(double item) {
        price = item;
    }

    public double taxableItem(Visitor visitor) {
        return visitor.taxCalculation(this);
    }

    public double getPrice() {
        return price;
    }

}
