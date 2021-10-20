import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args){

        //Dimioyrgia Scanner gia input apo ton xristi
        Scanner input = new Scanner(System.in);

        // Fasi arxikopoiisis
        int gradeCounter = 1; //Arxikopoiisi ton sinolo ton vathmon poy eisagonte apo tn xristi
        int total = 0; //Arxikopoiisi toy arithmou ton vathmon pou 8a isax8oun apo to xristi

        while (gradeCounter <= 10) // 10 loops
        {
            System.out.print("Enter Grade: "); //protropi
            int grade = input.nextInt(); //Eisodos epomenou vathmou
            total = total + grade; //Pros8esi vathmou sto sinolo
            gradeCounter = gradeCounter + 1; //Auxisi metriti kata 1
        }

        int average = total / 10;
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

    }
}
