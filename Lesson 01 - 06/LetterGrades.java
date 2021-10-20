import java.util.Scanner;

public class LetterGrades {

    public static void main(String[] args) {

        int total = 0; // άθροισμα βαθμών
        int gradeCounter = 0; // πλήθος εισαγόμενων βαθμών
        int aCount = 0; // Μέτρηση βαθμών Α
        int bCount = 0; // Μέτρηση βαθμών B
        int cCount = 0; // Μέτρηση βαθμών C
        int dCount = 0; // Μέτρηση βαθμών D
        int fCount = 0; // Μέτρηση βαθμών F

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n   %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On Unix/Linux/Mac OS x type <Ctrl> d press Enter", "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {

            int grade = input.nextInt(); // Διαβάζει τον αριθμό
            total += grade; // Προσθέτει το βαθμό στην total
            ++gradeCounter; // Αυξάνει το πλήθος των βαθμών

            switch (grade / 10) {

                case 9: // Βαθμός ήταν μεταξύ 90
                case 10: // και 100
                    ++aCount;
                    break; // Έξοδος από το  switch

                case 8: // Βαθμός μεταξύ του 80 και 89
                    ++bCount;
                    break; // Έξοδος από το  switch

                case 7: // Βαθμός μεταξύ του 70 και 79
                    ++cCount;
                    break; // Έξοδος από το  switch

                case 6: // Βαθμός μεταξύ του 60 και 69
                    ++dCount;
                    break; // Έξοδος από το  switch

                default: // Βαθμός μικρότερος από 60
                    ++fCount;
                    break; // Έξοδος από το  switch
            } // Τέλος switch
        } // Τέλος while

        // Εμφανίζει μια αναφορά των βαθμών
        System.out.printf("%nGrade Report: %n");

        // Αν ο χρήστης δώσει τουλάχιστον ένα βαθμό
        if (gradeCounter != 0) {

            // Υπολογίζει τον μέσο όρο όλων των βαθμών
            double average = (double) total / gradeCounter;

            // ΕΜφανίζει την σύνοψη των αποτελεσμάτων
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of the Students who received each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        } // Τέλος της if
        else // Δεν δώθηκαν βαθμόι συνεπώς εμφανίζει το αντίστοιχο μήνυμα
            System.out.println("No Grades were entered");
         } // Τέλος της main
    } // Τέλος της κλάσης LetterGrades


