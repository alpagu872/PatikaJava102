package A_Old_era.UsingInterface;

public interface IBanka {

    final String hostIpAddress = "127.0.01";

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNo, String cardExpDate, String cvc);

}
