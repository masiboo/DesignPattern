package org.example.visitor;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types

interface Visitor {

    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading

    public double taxCalculation(Liquor liquorItem);

    public double taxCalculation(Tobacco tobaccoItem);

    public double taxCalculation(Necessity necessityItem);

}
