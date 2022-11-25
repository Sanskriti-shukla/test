package ProductMiniProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    public HashMap<Integer, ProductModel> insert(HashMap<Integer, ProductModel> pMap) {
        Scanner sc = new Scanner(System.in);
        String s = "N";
        int id = 0;
        do {
            System.out.println("productName");
            String productName = sc.next();
            System.out.println(" ProductDesc..");
            String productDes = sc.next();
            System.out.println(" PurchasePrice");
            int purchasePrice = sc.nextInt();
            System.out.println(" SalesPrice");
            int salesPrice = sc.nextInt();
            System.out.println("Stock");
            int stock = sc.nextInt();
            System.out.println("Status");
            String status = sc.next();
            ProductModel productModel = new ProductModel(id, productName, productDes, purchasePrice, salesPrice, stock, status);
            pMap.put(id, productModel);
            id++;
            System.out.println("Do you want to exit ?. Y/N.");
            s = sc.next();
        }
        while (s.equalsIgnoreCase("N"));
        System.out.println("Have  a good day..");
       productData(pMap);
        return pMap;
    }

    public void view1(HashMap<Integer, ProductModel> pMap) {
        System.out.println("__________________List of Products____________");
        for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
            System.out.println("productId: " + obj1.getKey() + "\nproductName: " + obj1.getValue().getProductName() + "\nproductDesc: " + obj1.getValue().getProductDes() + "\npurchasePrice: " + obj1.getValue().getPurchase_Price() + "\nsalesPrice: " + obj1.getValue().getSalesPrice() + "\nstock: " + obj1.getValue().getStock() + "\nstatus: " + obj1.getValue().getStatus());
            System.out.println("--------------------------------------------");

        }
    }

    public HashMap<Integer, ProductModel> view(HashMap<Integer, ProductModel> pMap) {
        System.out.println("__________________List of Products_____________");
        for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
            System.out.println("productId: " + obj1.getKey() + "\nproductName: " + obj1.getValue().getProductName() + "\nproductDesc: " + obj1.getValue().getProductDes() + "\npurchasePrice: " + obj1.getValue().getPurchase_Price() + "\nsalesPrice: " + obj1.getValue().getSalesPrice() + "\nstock: " + obj1.getValue().getStock() + "\nstatus: " + obj1.getValue().getStatus());
            System.out.println("--------------------------------------------");


        }
       productData(pMap);
        return pMap;
    }

    public HashMap<Integer, ProductModel> delete(HashMap<Integer, ProductModel> pMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to delete");
        int id1 = sc.nextInt();
        if (!pMap.isEmpty()) {
            boolean id1Exist = false;
            for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
                if (obj1.getKey().equals(id1)) {
                    pMap.remove(id1);
                    System.out.println("deleted");
                    id1Exist = true;
                    break;
                }
            }
            if (!id1Exist) {
                ProductServiceImpl product = new ProductServiceImpl();
                product.view1(pMap);
                System.out.print("incorrect id please ");
                product.delete(pMap);
            }
        }
       productData(pMap);
        return pMap;
    }

    public HashMap<Integer, ProductModel> update(HashMap<Integer, ProductModel> pMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id you want to update...");
        int id1 = sc.nextInt();
        boolean id1Exist = false;
        if (!pMap.isEmpty()) {
            for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
                if (obj1.getKey().equals(id1)) {
                    System.out.println("what you want to update\n.please choose one\n1. ProductName\n2.ProductDesc\n3.PurchasePrice\n4.SalesPrice\n5.Stock\n6.Status");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter the new ProductName");
                        String productName = sc.next();
                        obj1.getValue().setProductName(productName);
                    } else if (ch == 2) {
                        System.out.println("Enter the new ProductDesc");
                        String productDesc = sc.next();
                        obj1.getValue().setProductDes(productDesc);
                    } else if (ch == 3) {
                        System.out.println("Enter the new PurchasePrice");
                        int purchasePrice = sc.nextInt();
                        obj1.getValue().setPurchase_Price(purchasePrice);
                    } else if (ch == 4) {
                        System.out.println("Enter the new SalesPrice");
                        int salesPrice = sc.nextInt();
                        obj1.getValue().setSalesPrice(salesPrice);
                    } else if (ch == 5) {
                        System.out.println("enter the new stock");
                        int stock = sc.nextInt();
                        obj1.getValue().setStock(stock);
                    } else if (ch == 6) {
                        System.out.println("Enter the new status");
                        String status = sc.next();
                        obj1.getValue().setStatus(status);
                    }
                    id1Exist = true;
                    break;
                }


            }
            if (!id1Exist) {
                ProductServiceImpl product = new ProductServiceImpl();
                product.view1(pMap);
                System.out.print("incorrect id please ");
                product.update(pMap);
            }
        }
       productData(pMap);
        return pMap;

    }

    public HashMap<Integer, ProductModel> search(HashMap<Integer, ProductModel> pMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one \n1.id\n2.ProductName");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Enter the id you want to search..");
            int id = sc.nextInt();
            if (!pMap.isEmpty()) {
                boolean idExist = false;
                for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
                    if (obj1.getKey().equals(id)) {
                        System.out.println("productId: " + obj1.getKey() + "\nproductName: " + obj1.getValue().getProductName() + " \nproductDesc: " + obj1.getValue().getProductDes() + "\npurchasePrice: " + obj1.getValue().getPurchase_Price() + "\nsalesPrice: " + obj1.getValue().getSalesPrice() + "\nstock: " + obj1.getValue().getStock() + "\nstatus: " + obj1.getValue().getStatus());
                        idExist = true;
                        break;
                    }

                }
                if (!idExist) {
                    ProductServiceImpl product = new ProductServiceImpl();
                    product.view1(pMap);
                    System.out.print("incorrect id please ");
                    product.search(pMap);
                }

            }

        } else if (option == 2) {
            System.out.println("Enter the productName");
            String PName = sc.next();
            if (!pMap.isEmpty()) {
                boolean PNameExist = false;
                for (Map.Entry<Integer, ProductModel> obj1 : pMap.entrySet()) {
                    if (obj1.getValue().getProductName().equals(PName)) {
                        System.out.println("productId: " + obj1.getKey() + "\nproductName: " + obj1.getValue().getProductName() + " \nproductDesc: " + obj1.getValue().getProductDes() + "\npurchasePrice: " + obj1.getValue().getPurchase_Price() + "\nsalesPrice: " + obj1.getValue().getSalesPrice() + "\nstock: " + obj1.getValue().getStock() + "\nstatus: " + obj1.getValue().getStatus());
                        PNameExist = true;
                        break;
                    }
                }
                if (!PNameExist) {
                    ProductServiceImpl product = new ProductServiceImpl();
                    product.view1(pMap);
                    System.out.print("incorrect productName please ");
                    product.search(pMap);
                }
            }
        }
        productData(pMap);
        return pMap;
    }

    public HashMap<Integer, ProductModel> productData(HashMap<Integer, ProductModel> pMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("\n1.insert\n2.view\n3.delete\n4.update\n5.search\n6.exit");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                 insert(pMap);
                break;
            case 2:
                 view(pMap);
                break;
            case 3:
                delete(pMap);
                break;
            case 4:
                update(pMap);
                break;
            case 5:
                search(pMap);
                break;
        }
        return pMap;
    }
}
