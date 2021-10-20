package com.company;

import java.util.Scanner;

public class AccountTest {

    public static void main (String[] args){

        //Dimiourgia enos antikeimenou Scanner gia eisodo apo to paratheiro entolon
        Scanner input = new Scanner(System.in);

        //Dimiourgia enos antikeimenou Account kai ekxorisi tou sto myAccount
        Account myAccount = new Account();

        //Emfanisi arxikis timis tou name (keni)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the Name: ");
        String theName = input.nextLine(); //anagnorisi mias grammis keimenou
        myAccount.setName(theName); //topo8etisi tou theName sto myAccount
        System.out.println(); //E3agei mia keni grammi

        //Emfanizei to onoma pou einai apothikeumeno sto antikeimeno myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}
