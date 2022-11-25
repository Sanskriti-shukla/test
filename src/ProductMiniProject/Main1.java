package ProductMiniProject;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    void main(HashMap<Integer, CategoryModel> hMap, HashMap<Integer, ProductModel> pMap, HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("1.Category\n2.product\n3.Purchase");
        int ch1 = sc.nextInt();
        switch (ch1) {
            case 1:
                CategoryServiceImpl category = new CategoryServiceImpl();
                category.categoryData(hMap);
                main(hMap, pMap, partyMap, pModel);
                break;
            case 2:
                ProductServiceImpl product = new ProductServiceImpl();
                product.productData(pMap);
                main(hMap, pMap, partyMap, pModel);
                break;
            case 3:
                PurchaseServiceImpl purchase = new PurchaseServiceImpl();
                purchase.purchase1(partyMap, pModel);
                main(hMap, pMap, partyMap, pModel);
                break;
        }
    }

}




