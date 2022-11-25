package ProductMiniProject;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main1 m1 = new Main1();
        HashMap<Integer, CategoryModel> hMap = new HashMap<>();
        HashMap<Integer, ProductModel>  pMap = new HashMap<>();
        HashMap<Integer, PartyModel> partyMap = new HashMap<>();
        HashMap<Integer, PurchaseModel> pModel = new HashMap<>();
        m1.main(hMap, pMap, partyMap, pModel);
    }
}
