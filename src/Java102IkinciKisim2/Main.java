package Java102IkinciKisim2;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Hasan","Akgün","1","Ankara",80);
        Student st2 = new Student("XXKRALTR"," ","2","Metin2",85);
        Student st3 = new Student("Hasanca","Falan","3","ASD",90);


        Course mat = new Course("Mat1", "MAT");
        Student[] stu = {st1,st2,st3};


        System.out.println("Ortalama: "+  mat.calcAverage(stu));


    }

}
