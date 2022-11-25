package ProductMiniProject;

import java.util.*;

public class PartyServiceImpl implements PartyService {
    public HashMap<Integer, PartyModel> insert(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        String s = "N";
        do {
            System.out.println("Enter  id..");
            int id = sc.nextInt();
            System.out.println("Enter ContactNumber");
            long contactNumber = sc.nextLong();
            System.out.println("partyname");
            String partyName = sc.next();
            System.out.println("AccountNo.");
            int accountNo = sc.nextInt();
            PartyModel partyModel = new PartyModel(id, contactNumber, partyName, accountNo);
            partyMap.put(id, partyModel);
            System.out.println("Do you want to exit ?.. Y/N.");
            s = sc.next();
        }
        while (s.equalsIgnoreCase("N"));
        System.out.println("Have  a good day..");
        partyMap = partyData(partyMap, pModel);
        return partyMap;
    }

    public void view1(HashMap<Integer, PartyModel> partyMap) {
        System.out.println("__________________List of party___________________");
        for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
            System.out.println("PartyId: " + obj2.getKey() + "\nContactNo: " + obj2.getValue().getContactNumber() + "\npartyname: " + obj2.getValue().getPartyName() + "\nAccountNo: " + obj2.getValue().getAccountNumber());
            System.out.println("----------------------------------------------------");
        }
    }

    public HashMap<Integer, PartyModel> view(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        System.out.println("____________________List of Party__________________");
        for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
            System.out.println("PartyId: " + obj2.getKey() + "\nContactNo: " + obj2.getValue().getContactNumber() + "\npartyname: " + obj2.getValue().getPartyName() + "\nAccountNo: " + obj2.getValue().getAccountNumber());
            System.out.println("--------------------------------------------------");
        }
        partyMap = partyData(partyMap, pModel);
        return partyMap;

    }

    public HashMap<Integer, PurchaseModel> delete(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Set<Integer> set = new HashSet<>();
        PartyServiceImpl party = new PartyServiceImpl();
        party.view1(partyMap);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Partyid you want to delete");
        int partyId = sc.nextInt();
        for (Map.Entry<Integer, PurchaseModel> obj2 : pModel.entrySet()) {
            if (obj2.getValue().getPartyId() == partyId) {
                set.add(obj2.getKey());

            }
        }
        pModel.keySet().removeAll(set);
        partyMap.remove(partyId);
        System.out.println("deleted..");
        partyMap = partyData(partyMap, pModel);

        return pModel;
    }

    public HashMap<Integer, PartyModel> update(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the partyid you want to update..");
        int id = sc.nextInt();
        boolean idExist = false;
        if (!partyMap.isEmpty()) {
            for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
                if (obj2.getKey().equals(id)) {
                    System.out.println("choose one to update..\n1.ContactNo\n2.partyname\n3.AccountNo");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("new ContactNo.");
                        long NewNo = sc.nextLong();
                        obj2.getValue().setContactNumber(NewNo);
                    } else if (ch == 2) {
                        System.out.println("new partyname.");
                        String newName = sc.next();
                        obj2.getValue().setPartyName(newName);
                    } else if (ch == 3) {
                        System.out.println("new account number");
                        int newAccount = sc.nextInt();
                        obj2.getValue().setAccountNumber(newAccount);

                    }
                    idExist = true;
                    break;
                }
            }
            if (!idExist) {
                PartyServiceImpl party = new PartyServiceImpl();
                party.view1(partyMap);
                System.out.print("incorrect id please ");
                party.update(partyMap, pModel);
            }
        }
        partyMap = partyData(partyMap, pModel);
        return partyMap;
    }

    public HashMap<Integer, PartyModel> search(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one to search.\n1.partyid\n2.partyname");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Enter the partyid...");
            int id = sc.nextInt();
            if (!partyMap.isEmpty()) {
                boolean idExist = false;
                for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
                    if (obj2.getKey().equals(id)) {
                        System.out.println("PartyId: " + obj2.getKey() + "\nContactNo: " + obj2.getValue().getContactNumber() + "\npartyname: " + obj2.getValue().getPartyName() + "\nAccountNo: " + obj2.getValue().getAccountNumber());

                        idExist = true;
                    }
                }
                if (!idExist) {
                    PartyServiceImpl party = new PartyServiceImpl();
                    party.view1(partyMap);
                    System.out.print("incorrect partyId please ");
                    party.search(partyMap, pModel);
                }
            }
        } else if (option == 2) {
            System.out.println("Enter the partyname ");
            String PartyName = sc.next();
            if (!partyMap.isEmpty()) {
                boolean partyNameExist = false;
                for (Map.Entry<Integer, PartyModel> obj2 : partyMap.entrySet()) {
                    if (obj2.getValue().getPartyName().equals(PartyName)) {
                        System.out.println("PartyId: " + obj2.getKey() + "\nContactNo: " + obj2.getValue().getContactNumber() + "\npartyname: " + obj2.getValue().getPartyName() + "\nAccountNo: " + obj2.getValue().getAccountNumber());
                        partyNameExist = true;
                        break;
                    }
                }
                if (!partyNameExist) {
                    PartyServiceImpl party = new PartyServiceImpl();
                    party.view1(partyMap);
                    System.out.print("incorrect partyId please ");
                    party.search(partyMap, pModel);
                }

            }
        }
        partyMap = partyData(partyMap, pModel);
        return partyMap;
    }

    public HashMap<Integer, PartyModel> partyData(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("1.Insert\n2.View\n3.delete\n4.update\n5.search\n6.exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                partyMap = insert(partyMap, pModel);
                break;
            case 2:
                partyMap = view(partyMap, pModel);
                break;
            case 3:
                pModel = delete(partyMap, pModel);
                break;
            case 4:
                partyMap = update(partyMap, pModel);
                break;
            case 5:
                partyMap = search(partyMap, pModel);
                break;
            case 6:
                break;
        }

        return partyMap;
    }
}
