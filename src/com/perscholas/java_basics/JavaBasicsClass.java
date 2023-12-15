package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int sumOfBoth = num1 + num2;
        System.out.println(sumOfBoth);

        double first_number, second_number, sumFirstSecond;
        first_number = 200;
        second_number= 300;
        sumFirstSecond = first_number + second_number;
        System.out.println(sumFirstSecond);

        double number1 = 10.5;
        int number2 = 6;
        double sumOfNumbers = number1 + number2;
        System.out.println(sumOfNumbers);

        int number_1, number_2, number_3;
        number_1 = 20;
        number_2 = 40;
        number_3 = number_2/number_1;
        System.out.println(number_3);

        double nu1, nu2, nu3;
        nu1 = 90.5;
        nu2 = 13.5;
        nu3 = nu1/nu2;
        System.out.println(nu3);
        int resultInt = (int) nu3;
        System.out.println(resultInt);

        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(q);
        q = (int) (double) y;
        System.out.println(q);

        final double PI = 3.14159265359;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println(area);

        double priceOfCoffee = 2.50;
        double priceOfCappuccino = 3.00;
        double priceOfEspresso = 2.00;
        int quantityCoffee = 3;
        int quantityCappuccino = 4;
        int quantityEspresso = 2;

        double subtotal = (priceOfCoffee * quantityCoffee) + (priceOfCappuccino * quantityCappuccino)
                + (priceOfEspresso * quantityEspresso);
        final double SALES_TAX_RATE = 0.08;

        double totalSale = subtotal + (subtotal * SALES_TAX_RATE);
    }


}
