package Z_New_era.E_PatikaStore;

public class Product {
    private int id;
    private String productName;
    private double unitPrice;
    private double discount;
    private double unitStock;

    public Product(int id, String productName, double unitPrice, double discount, double unitStock) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.unitStock = unitStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(double unitStock) {
        this.unitStock = unitStock;
    }
}
