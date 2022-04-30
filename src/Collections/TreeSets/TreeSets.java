package Collections.TreeSets;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {


        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());

        students.add(new Student("Hasan",20));
        students.add(new Student("Remzi",50));
        students.add(new Student("Hüseyin",40));


        for (Student st: students
             ) {
            System.out.println(st.getName() + " " + st.getNote());

        }





    }
}
