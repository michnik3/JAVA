public class Student {

    private String name;
    private double average;

    //Define values
    public Student(String name, double average) {

        this.name = name;

        //checked that average is >0.0 and <= 100.0 else
        //keeps the default value (average(0.0)
        if (average > 0.0)
            if (average <= 100)
                this.average = average;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        //checked that average is >0.0 and <= 100.0 else
        //keeps the default value (average(0.0)
        if (average > 0.0)
            if (average <= 100)
                this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "";
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
