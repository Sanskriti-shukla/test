package ProductMiniProject;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CategoryServiceImpl implements CategoryService {
    public HashMap<Integer, CategoryModel> insert(HashMap<Integer, CategoryModel> hMap) {
        Scanner sc = new Scanner(System.in);
        String check = "N";
        int id = 0;
        do {
//        if (hMap != null) {
            System.out.println("Enter the CategoryName. ");
            String CategoryName = sc.next();
            System.out.println("Enter the CategoryDes..");
            String CategoryDes = sc.next();
            CategoryModel category = new CategoryModel(id, CategoryName, CategoryDes);
            hMap.put(id, category);
            id++;
            System.out.println("Do you want to exit ?.. Y/N.");
            check = sc.next();
        }
        while (check.equalsIgnoreCase("N"));
        categoryData(hMap);
        return hMap;
}

    public void view1(HashMap<Integer, CategoryModel> hMap) {
        System.out.println("_______________List of Category________________");
        for (Map.Entry<Integer, CategoryModel> obj : hMap.entrySet()) {
            System.out.println("Id  " + obj.getKey() + "\ncategoryName  " + obj.getValue().getCategoryName() + "\ncategoryDesc  " + obj.getValue().getCategoryDes());
            System.out.println("----------------------------------------------");

        }
    }

    public HashMap<Integer, CategoryModel> view(HashMap<Integer, CategoryModel> hMap) {
        System.out.println("_______________List of Category_____________");
        for (Map.Entry<Integer, CategoryModel> obj : hMap.entrySet()) {
            System.out.println("Id  " + obj.getKey() + "\ncategoryName  " + obj.getValue().getCategoryName() + "\ncategoryDesc  " + obj.getValue().getCategoryDes());
            System.out.println("--------------------------------------------");

        }
        hMap = categoryData(hMap);
        return hMap;
}
    public HashMap<Integer, CategoryModel> delete(HashMap<Integer, CategoryModel> hMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to delete");
        int id1 = sc.nextInt();
        if (!hMap.isEmpty()) {
            boolean idExist = false;
            for (Map.Entry<Integer, CategoryModel> integerCategoryModelEntry : hMap.entrySet()) {
                if (integerCategoryModelEntry.getKey().equals(id1)) {
                    hMap.remove(id1);
                    System.out.println("deleted");
                    idExist = true;
                    break;
                }

            }
            if (!idExist) {
                CategoryServiceImpl category = new CategoryServiceImpl();
                category.view1(hMap);
                System.out.print("incorrect  id please ");
                category.delete(hMap);
            }
        }
        categoryData(hMap);
        return hMap;
    }

    public HashMap<Integer, CategoryModel> update(HashMap<Integer, CategoryModel> hMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to update...");
        int id1 = sc.nextInt();
        boolean id1Exist = false;
        if (!hMap.isEmpty()) {
            for (Map.Entry<Integer, CategoryModel> obj : hMap.entrySet()) {
                if (obj.getKey().equals(id1)) {
                    System.out.println("what you want to update \n1.CategoryName\n2.CategoryDesc");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("new CategoryName..");
                        String categoryname = sc.next();
                        obj.getValue().setCategoryName(categoryname);
                    } else if (ch == 2) {
                        System.out.println("new CatgoryDesc");
                        String categorydesc = sc.next();
                        obj.getValue().setCategoryDes(categorydesc);
                    }
                    id1Exist = true;
                    break;
                }
            }
            if (!id1Exist) {
                CategoryServiceImpl category = new CategoryServiceImpl();
                category.view1(hMap);
                System.out.print("incorrect id please ");
                category.update(hMap);
            }
        }
        hMap = categoryData(hMap);
        return hMap;
    }

    public HashMap<Integer, CategoryModel> search(HashMap<Integer, CategoryModel> hMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one to search.\n1.id\n2.CategoryName");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter the id..");
            int id = sc.nextInt();
            if (!hMap.isEmpty()) {
                boolean idExist = false;
                for (Map.Entry<Integer, CategoryModel> obj : hMap.entrySet()) {
                    if (obj.getKey().equals(id)) {
                        System.out.println("Id  " + obj.getKey() + "\ncategoryName  " + obj.getValue().getCategoryName() + "\ncategoryDesc  " + obj.getValue().getCategoryDes());
                        idExist = true;
                        break;
                    }
                }
                if (!idExist) {
                    CategoryServiceImpl category = new CategoryServiceImpl();
                    category.view1(hMap);
                    System.out.print("incorrect id please ");
                    category.search(hMap);

                }
            }
        } else if (ch == 2) {
            System.out.println("Enter the categoryname");
            String CategoryName = sc.next();
            if (!hMap.isEmpty()) {
                boolean categoryNameExist = false;
                for (Map.Entry<Integer, CategoryModel> obj : hMap.entrySet()) {
                    if (obj.getValue().getCategoryName().equals(CategoryName)) {
                        System.out.println("Id  " + obj.getKey() + "\ncategoryName  " + obj.getValue().getCategoryName() + "\ncategoryDesc  " + obj.getValue().getCategoryDes());
                        categoryNameExist = true;
                        break;
                    }

                }
                if (!categoryNameExist) {
                    CategoryServiceImpl category = new CategoryServiceImpl();
                    category.view1(hMap);
                    System.out.print("incorrect id please ");
                    category.search(hMap);
                }
            }
        }
        hMap = categoryData(hMap);
        return hMap;
    }

    public HashMap<Integer, CategoryModel> categoryData(HashMap<Integer, CategoryModel> hMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice..");
        System.out.println("1.Insert\n2.View\n3.delete\n4.update\n5.search\n6.exit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:

               insert(hMap);
                break;
            case 2:
                 view(hMap);
                break;
            case 3:
               delete(hMap);
                break;
            case 4:
                update(hMap);
                break;
            case 5:
                search(hMap);
                break;
            default:
                break;
        }
        return hMap;
    }
}
