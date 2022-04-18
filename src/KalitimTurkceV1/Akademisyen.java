package KalitimTurkceV1;

public class Akademisyen extends Calisan {
    // atası olan sınıfta eğer dolu bir cons var ise,
    // ata sınıftaki constructor'ı çağırmak zorunda

    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefonNo, String ePosta, String bolum, String unvan) {
        super(adSoyad, telefonNo, ePosta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println( this.unvan +" "+ this.getAdSoyad() + " derse giriyor.");
    }
}
