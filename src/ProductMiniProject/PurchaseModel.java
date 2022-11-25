package ProductMiniProject;

public class PurchaseModel {
  private int id;
   private int orderNo;
   private String orderDate;
   private int quantity;
   private int price;
   private int partyId;
   private String partyName;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public PurchaseModel(int id, int orderNo, String orderDate, int quantity, int price, int partyId, String partyName) {
        this.id = id;
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.price = price;
        this.partyId = partyId;
        this.partyName = partyName;
    }
}