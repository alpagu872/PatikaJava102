package KalitimTurkceV1;

public class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefonNo, String ePosta, String departman,String mesai) {
        super(adSoyad, telefonNo, ePosta);
        this.departman = departman;
        this.mesai = mesai;

    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis() {
        System.out.println(this.getAdSoyad() + " memur görevini yapıyor.");
    }
}