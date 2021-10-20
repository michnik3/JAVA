public class LogicalOperators {

    public static void main(String[] args){

        // Δημιουργεί τον πίνακα αληθείας για τον τελεστή && (υπό συνθήκη AND)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional AND (&&)", "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // Δημιουργεί τον πίνακα αληθείας για τον τελεστή || (υπό συνθήκη OR)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Conditional OR (||)", "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // Δημιουργεί τον πίνακα αληθείας για τον τελεστή & (boolean λογικό AND)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Boolean logical AND (&)", "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));

        // Δημιουργεί τον πίνακα αληθείας για τον τελεστή | (boolean λογικό διαζευτικό OR)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Boolean logical inclusive OR (|)", "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));

        // Δημιουργεί τον πίνακα αληθείας για τον τελεστή ^ (boolean λογικό αποκλειστικό OR)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n:",
                "Boolean logical exclusive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));

        //Δημιουργεί τον πίνακα αληθείας για τον τελεστή ! (λογική άρνηση)
        System.out.printf("%s%n%s: %b%n%s %b%n", "Logical NOT (!)",
                "!false", (!false), "!true", (!true));

    }

}
