package UsingInterface;

public class ABankasi implements IBanka, IDeneme {

    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip: " + ipAddress);
        System.out.println("Makine ip: " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " adlı bankaya bağlanıldı.");

        return true;
    }

    @Override
    public boolean payment(double price, String cardNo, String cardExpDate, String cvc) {
        //Banka ödeme işlemleri bla bla

        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("İşlem başarılı.");

        return true;
    }


    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
