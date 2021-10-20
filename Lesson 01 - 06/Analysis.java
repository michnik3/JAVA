import java.util.Scanner;

public class Analysis {

    public static void main(String[] args){

        int failures = 0;
        int passes = 0;
        int studentCounter = 1;


        while (studentCounter <= 10){

            System.out.print("Enter the result (1 = pass, 2 = fail): ");
            Scanner input = new Scanner(System.in);
            int result = input.nextInt();

            if (result == 1){
                passes = passes +1;
                System.out.printf("Failed");
            }
            else if(result == 2){
                failures = failures + 1;
                System.out.printf("Successed");
            studentCounter = studentCounter + 1;
            }
            System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        }
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }

}
