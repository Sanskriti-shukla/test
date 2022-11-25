package ProductMiniProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PurchaseOrder {
    private PartyModel method(HashMap<Integer, PartyModel> partyMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of party..");
        PartyServiceImpl party = new PartyServiceImpl();
        party.view1(partyMap);
        System.out.println("Enter the partyId");
        int id1 = sc.nextInt();
        sc.nextLine();
        PartyModel partyModel = null;
        if (!partyMap.isEmpty()) {
            boolean PartyExit = false;
            for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
                if (obj2.getValue().getPartyid() != 0 && obj2.getValue().getPartyid() == id1) {
                    partyModel = obj2.getValue();

                    PartyExit = true;
                    break;
                }
            }
            if (!PartyExit) {
                System.out.println("party does not exit");
            }
        }

        return partyModel;
    }

    private HashMap<Integer, PurchaseModel> insert(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {

        PartyModel partyModel = method(partyMap);
        if (partyModel != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the orderid");
            int orderId = sc.nextInt();
            System.out.println(" orderNo.");
            int OrderNo = sc.nextInt();
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String strDate = formatter.format(date);
            System.out.println("quantity");
            int quantity = sc.nextInt();
            System.out.println("price");
            int price = sc.nextInt();
            PurchaseModel purchaseModel = new PurchaseModel(orderId, OrderNo, strDate, quantity, price, partyModel.getPartyid(), partyModel.getPartyName());
            pModel.put(orderId, purchaseModel);
            System.out.println("do you want to exit  ..y/n");
            String check = sc.next();
            if (check.equalsIgnoreCase("N")) {
                pModel = insert(partyMap, pModel);
            }
        }
        purchaseData(pModel, partyMap);
        return pModel;

    }

    public void view1(HashMap<Integer, PurchaseModel> pModel) {
        System.out.println("____________________List of purchaseOrder__________________");
        for (Map.Entry<Integer, PurchaseModel> obj3 : pModel.entrySet()) {
            System.out.println("partyId:" + obj3.getValue().getPartyId() + "\npartyName:" + obj3.getValue().getPartyName() + "\norderId: " + obj3.getKey() + "\norderNo:" + obj3.getValue().getOrderNo() + "\norderDate:" + obj3.getValue().getOrderDate() + "\nQuantity: " + obj3.getValue().getQuantity() + "\nprice: " + obj3.getValue().getPrice());
            System.out.println("------------------------------------------------------");
        }
    }

    private HashMap<Integer, PurchaseModel> view(HashMap<Integer, PurchaseModel> pModel, HashMap<Integer, PartyModel> partyMap) {
        System.out.println("____________________List of party______________________");
        for (Map.Entry<Integer, PurchaseModel> obj3 : pModel.entrySet()) {
            System.out.println("partyId:" + obj3.getValue().getPartyId() + "\npartyName:" + obj3.getValue().getPartyName() + "\norderId: " + obj3.getKey() + "\norderNo:" + obj3.getValue().getOrderNo() + "\norderDate:" + obj3.getValue().getOrderDate() + "\nQuantity: " + obj3.getValue().getQuantity() + "\nprice: " + obj3.getValue().getPrice());
            System.out.println("------------------------------------------------------");
        }
        purchaseData(pModel, partyMap);
        return pModel;
    }

    private HashMap<Integer, PurchaseModel> delete(HashMap<Integer, PurchaseModel> pModel, HashMap<Integer, PartyModel> partyMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Orderid you want to delete..");
        int id = sc.nextInt();
        sc.nextLine();
        if (!pModel.isEmpty()) {
            boolean idExist = false;
            for (Map.Entry<Integer, PurchaseModel> obj2 : pModel.entrySet()) {
                if (obj2.getValue().getId() == id) {
                    pModel.remove(obj2.getKey());
                    System.out.println("deleted");
                    idExist = true;
                    break;
                }
            }
            if (!idExist) {
                PurchaseOrder purchaseOrder = new PurchaseOrder();
                purchaseOrder.view1(pModel);
                System.out.print("order id is not found please ");
                purchaseOrder.delete(pModel, partyMap);

            }
        }
        purchaseData(pModel, partyMap);
        return pModel;
    }

    private HashMap<Integer, PurchaseModel> search(HashMap<Integer, PurchaseModel> pModel, HashMap<Integer, PartyModel> partyMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one to search..\n1.partyid\n2.orderno.");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("enter the partyid you want to search..");
            int id = sc.nextInt();
            boolean idExist = false;
            if (!pModel.isEmpty()) {
                for (Map.Entry<Integer, PurchaseModel> obj3 : pModel.entrySet()) {
                    if (obj3.getValue().getPartyId() == id) {
                        System.out.println("partyId:" + obj3.getValue().getPartyId() + "\npartyName:" + obj3.getValue().getPartyName() + "\norderId: " + obj3.getKey() + "\norderNo:" + obj3.getValue().getOrderNo() + "\norderDate:" + obj3.getValue().getOrderDate() + "\nQuantity: " + obj3.getValue().getQuantity() + "\nprice: " + obj3.getValue().getPrice());

                        idExist = true;
                        break;
                    }
                }
                if (!idExist) {
                    PurchaseOrder purchaseOrder = new PurchaseOrder();
                    purchaseOrder.view1(pModel);
                    System.out.print("incorrect partyId  is not found please again ");
                    purchaseOrder.search(pModel, partyMap);

                }
            }

        } else if (ch == 2) {
            System.out.println("Enter the orderno..");
            int orderNo = sc.nextInt();
            boolean orderNoExist = false;
            if (!pModel.isEmpty()) {
                for (Map.Entry<Integer, PurchaseModel> obj3 : pModel.entrySet()) {
                    if (obj3.getValue().getOrderNo() == orderNo) {
                        System.out.println("partyId:" + obj3.getValue().getPartyId() + "\npartyName:" + obj3.getValue().getPartyName() + "\norderId: " + obj3.getKey() + "\norderNo:" + obj3.getValue().getOrderNo() + "\norderDate:" + obj3.getValue().getOrderDate() + "\nQuantity: " + obj3.getValue().getQuantity() + "\nprice: " + obj3.getValue().getPrice());

                        orderNoExist = true;
                        break;
                    }
                }
                if (!orderNoExist) {
                    PurchaseOrder purchaseOrder = new PurchaseOrder();
                    purchaseOrder.view1(pModel);
                    System.out.print(" orderId is not found please again ");
                    purchaseOrder.search(pModel, partyMap);

                }

            }
        }
        purchaseData(pModel, partyMap);
        return pModel;
    }

    private HashMap<Integer, PurchaseModel> update(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the orderId you want..");
        int id = sc.nextInt();
        boolean idExist = false;
        if (!pModel.isEmpty()) {
            for (Map.Entry<Integer, PurchaseModel> obj3 : pModel.entrySet()) {
                if (obj3.getKey().equals(id)) {
                    System.out.println("What you want to update..\n1.orderno\n2quantity\n3.Price");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter the new orderno..");
                        int OrderNo = sc.nextInt();
                        sc.nextLine();
                        obj3.getValue().setOrderNo(OrderNo);

                    } else if (ch == 2) {
                        System.out.println("Enter the new quantity");
                        int quantity = sc.nextInt();
                        obj3.getValue().setQuantity(quantity);

                    } else if (ch == 3) {
                        System.out.println("Enter the new price");
                        int price = sc.nextInt();
                        obj3.getValue().setPrice(price);
                    }


                    idExist = true;
                    break;

                }
            }
            if (!idExist) {
                PurchaseOrder purchaseOrder = new PurchaseOrder();
                purchaseOrder.view1(pModel);
                System.out.print(" orderId is not found please again ");
                purchaseOrder.update(partyMap, pModel);

            }
        }
        purchaseData(pModel, partyMap);
        return pModel;
    }

    void purchaseData(HashMap<Integer, PurchaseModel> pModel, HashMap<Integer, PartyModel> partyMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select one..\n1.insert\n2.view\n3.delete\n4.update\n5.search\n6.exit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                insert(partyMap, pModel);
                break;
            case 2:
                view(pModel, partyMap);
                break;
            case 3:
                delete(pModel, partyMap);
                break;
            case 4:
                update(partyMap, pModel);
                break;
            case 5:
                search(pModel, partyMap);
                break;
            default:
                break;
        }
    }
}


