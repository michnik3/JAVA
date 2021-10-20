package com.company;

import java.util.Scanner;

    public class firstP {
        public static void main(String[] args) {

            //Dimiourgei to scanner, gia na parei eisodo apo to parathiro entolon
            Scanner input = new Scanner(System.in);

            //dilosi
            int number1;
            int number2;
            int sum;

            System.out.println("Give the first integer: ");
            number1 = input.nextInt();

            System.out.println("Give the second Integer: ");
            number2 = input.nextInt();

            sum = number1 + number2;

            System.out.printf("Sum is %d%n", sum);

            // write your code here
        }
    }
