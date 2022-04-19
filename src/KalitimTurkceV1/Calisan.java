package KalitimTurkceV1;

public class Calisan {
    private String adSoyad;
    private String telefonNo;
    private String ePosta;


    public Calisan(String adSoyad, String telefonNo, String ePosta) {
        this.adSoyad = adSoyad;
        this.telefonNo = telefonNo;
        this.ePosta = ePosta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " üniversiteye giriş yaptı.");

    }

//    public void giris(String girisSaati) {
//
//        System.out.println(this.adSoyad + " " + girisSaati + " saatinde üniversiteye giriş yaptı.");
//    }
//    public void giris(String girisSaati, String cikisSaati){
//        System.out.println(this.adSoyad  + " " + girisSaati +" saatinde üniversiteye giriş yaptı, " + cikisSaati+ " saatinde çıkış yapacaktır." );
//    }

    public void cikis() {
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı.");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye giriş yaptı.");
    }


    public static void girisYapanlar(Calisan[] loginUsers) {
        for (Calisan c : loginUsers) {

            c.giris();

        }
    }
}
