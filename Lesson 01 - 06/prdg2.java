package com.company;

import java.util.Scanner;

public class prdg2 {

    public static void main(String[] args) {

        //Dimiourgei to scanner, gia na parei eisodo apo to parathiro entolon
        Scanner input = new Scanner(System.in);

        //dilosi
        int number1;
        int number2;


        System.out.println("Give the first integer: ");
        number1 = input.nextInt();

        System.out.println("Give the second Integer: ");
        number2 = input.nextInt();

        if  (number1 == number2)
            System.out.printf("%d == %d%n", number1 ,number2);

        if  (number1 != number2)
            System.out.printf("%d != %d%n", number1 ,number2);

        if  (number1 < number2)
            System.out.printf("%d < %d%n", number1 ,number2);

        if  (number1 > number2)
            System.out.printf("%d < %d%n", number1 ,number2);

        if  (number1 <= number2)
            System.out.printf("%d <= %d%n", number1 ,number2);

        if  (number1 >= number2)
            System.out.printf("%d <= %d%n", number1 ,number2);

    }
}
