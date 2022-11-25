package Medicine_task;
import java.util.*;

public class Solution  {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Medicine[] medicines = new Medicine[4];
                for (int i = 0; i < 4; i++) {
                System.out.println("Enter the MedicineName");
                String MedicineName = sc.next();
                System.out.println("Enter the batch");
                String batch = sc.next();
                System.out.println("Enter the disease");
                String disease = sc.next();
                System.out.println("Enter the price");
                int price = sc.nextInt();
                medicines[i]=new Medicine(MedicineName,batch,disease,price);
            }
                System.out.println("Enter the disease to know price..");
                String disease1=sc.next();
                System.out.println(getPriceByDisease(medicines,disease1));
            }
            public static  List<Integer> getPriceByDisease (Medicine[] medicines, String disease1) {
                List<Integer> price = new ArrayList<>();
                for (int i = 0; i < medicines.length; i++) {
                if (medicines[i].getDisease().equals(disease1)) {

                    price.add(medicines[i].getPrice());
                 }
                    Collections.sort(price);
                }
                return price;
        }
}

