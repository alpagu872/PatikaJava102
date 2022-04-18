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

        Memur n1 = new Memur("Hasanc", "465546", "asdjb@gmail.com", "Bilgi İşlem", "09:00-18:00");
        n1.calis();
    }
}
