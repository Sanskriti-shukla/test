package Medicine_task;

public class Medicine {
    String MedicineName;
    String batch;
    String disease;
    int price;

    public Medicine() {

    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "MedicineName='" + MedicineName + '\'' +
                ", batch='" + batch + '\'' +
                ", disease='" + disease + '\'' +
                ", price=" + price +
                '}';
    }

    public Medicine(String medicineName, String batch, String disease, int price) {
        MedicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}
