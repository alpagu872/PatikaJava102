package A_Old_era.company;

public class Calculate {
    public static void CalcAverage(Course[] notes) {

        double total = 0;
        for (Course c : notes) {
            total += c.note;
        }

        double av = total / notes.length;
        System.out.println("Ortalamanız: " + av);

    }

}
