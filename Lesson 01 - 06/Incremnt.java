package com.company;

public class Incremnt {

    public static void main(String[] args) {
        int  c = 5;
        System.out.printf("c before postincrement: %d%n", c); //prints 5
        System.out.printf("   postincrementing c: %d%n", c++); //prints 5
        System.out.printf("c before postincrement: %d%n", c); //prints 6

        System.out.println(); //agnoei mia grammi

        c = 5;
        System.out.printf("c before preincrement: %d%n", c); //prints 5
        System.out.printf("   preincrementing c: %d%n", ++c); //prints 6
        System.out.printf("c before preincrement: %d%n", c); //prints 6


    }
}
