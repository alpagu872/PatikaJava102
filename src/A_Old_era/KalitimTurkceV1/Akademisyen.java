package A_Old_era.KalitimTurkceV1;

public abstract class Akademisyen extends Calisan {
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

    public abstract void derseGir(String dersSaati);

    //OVERRIDE
    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " adlı akademisyen  A kapısından üniversiteye giriş yaptı.");
    }
}
