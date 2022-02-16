package org.example.visitor;

class Liquor implements Taxable {

    private double price;

    Liquor(double item) {
        price = item;
    }

    public double taxableItem(Visitor visitor) {
        return visitor.taxCalculation(this);
    }

    public double getPrice() {
        return price;
    }

}
