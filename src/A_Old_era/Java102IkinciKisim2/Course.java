package A_Old_era.Java102IkinciKisim2;

public class Course {
    private String courseName;
    private String code;

    public Course(String courseName, String code) {
        this.courseName = courseName;
        this.code = code;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Course uses a Student (Course sınıfı Student sınıfına bağlıdır.)
    public double calcAverage(Student[] students) {
        double average = 0;

        for (int i = 0; i < students.length; i++) {
            average += students[i].getNote();
        }

        return average / students.length;
    }
}
