package org.example.visitor;

public class VisitorTest {
    public static void main(String[] args) {

        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.taxableItem(taxCalc) + "\n");
        System.out.println(vodka.taxableItem(taxCalc) + "\n");
        System.out.println(cigars.taxableItem(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.taxableItem(taxHolidayCalc) + "\n");
        System.out.println(vodka.taxableItem(taxHolidayCalc) + "\n");
        System.out.println(cigars.taxableItem(taxHolidayCalc) + "\n");

    }
}
