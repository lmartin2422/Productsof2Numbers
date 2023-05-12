import java.util.*;

public class Main {
    public static void main(String[] args) {



        System.out.println("Product of 2 Numbers Program");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers separated by a space: ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();

        float product = number1 * number2;

        System.out.println("The product of " +number1+ " and " +number2+ " is " + product);

        System.out.println(Products.products(25, 0));




    }
}