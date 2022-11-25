package ProductMiniProject;

import java.util.HashMap;
import java.util.Scanner;

public class PurchaseServiceImpl implements PurchaseService {

    public void purchase1(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("1.Party\n2.PurchaseOrder\n3.exit");
        int ch1 = sc.nextInt();
        switch (ch1) {
            case 1:
                PartyServiceImpl party = new PartyServiceImpl();
                party.partyData(partyMap, pModel);
                purchase1(partyMap, pModel);
                break;
            case 2:
                PurchaseOrder purchaseOrder = new PurchaseOrder();
                purchaseOrder.purchaseData(pModel, partyMap);
                purchase1(partyMap, pModel);
                break;
            case 3:
                break;
        }
    }
}
