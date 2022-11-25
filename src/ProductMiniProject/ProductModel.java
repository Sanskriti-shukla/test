package ProductMiniProject;

public class ProductModel {
    private String productName;
    private String productDes;
    private int purchase_Price;
    private int salesPrice;
    private int stock;
    private String status;

    public ProductModel(int id, String productName, String productDes, int purchase_Price, int salesPrice, int stock, String status) {
        this.productName = productName;
        this.productDes = productDes;
        this.purchase_Price = purchase_Price;
        this.salesPrice = salesPrice;
        this.stock = stock;
        this.status = status;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public int getPurchase_Price() {
        return purchase_Price;
    }

    public void setPurchase_Price(int purchase_Price) {
        this.purchase_Price = purchase_Price;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}