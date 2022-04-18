package KalitimTurkceV1;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefonNo, String ePosta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefonNo, ePosta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    @Override
    public void giris( ){
        System.out.println(this.getAdSoyad() + " öğretim görevlisi B kapısından giriş yaptı.");
    }
}
