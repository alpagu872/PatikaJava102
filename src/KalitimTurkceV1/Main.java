package KalitimTurkceV1;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Hasan AKGÜN", "05050055", "hasanfalan@akgun.com");

        //System.out.println(c1.getAdSoyad());
        //c1.yemekhane();
        Akademisyen a1 = new Akademisyen("AKADEMİK HASAN", "1456450", "Hasanca@akademi.com", "CENG", "Doç.");
        //a1.cikis();
        //a1.getePosta();
        //System.out.println(a1.getUnvan());
        //a1.cikis();
        //a1.derseGir();

        OgretimGorevlisi o1 = new OgretimGorevlisi("Alp", "0544512212", "jkads@gmail.com", "CENG", "Prof.", "24");


        Memur n1 = new Memur("Hasanc", "465546", "asdjb@gmail.com", "Bilgi İşlem", "09:00-18:00");
        //Metot overloading (Metotlarda aşırı yüklenme)
        //n1.giris("10:00","18:00");

        //a2 bir çalışan fakat akademisyen gibi davranacak.
        Calisan a2 = new Akademisyen("XXKRALTR", "1456450", "Hasanca@akademi.com", "CENG", "Doç.");

//        int[] loginUser = new int[5];
        //Akademisyen[] loginUser = {c1,a1,n1,o1};

        //Hepsinin ortak atası çalışan sınıfı olduğu için, calisan tipinde bir array oluşturuyoruz.

        Calisan[] loginUser = {c1, a1,a2, n1, o1};

        Calisan.girisYapanlar(loginUser);

//        a2.giris();
//
//        o1.giris();
//        a1.giris();
//        c1.giris();
//        n1.giris();

    }
}
