package Enginee_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] engines = new Engine[4];
        for (int i = 0; i < engines.length; i++) {
            System.out.println("engineId");
            int engineId = sc.nextInt();
            System.out.println("engineName");
            String engineName = sc.next();
            System.out.println("engineType");
            String engineType = sc.next();
            System.out.println(" enginePrice");
            double enginePrice = sc.nextDouble();
            engines[i] = new Engine(engineId, engineName, engineType, enginePrice);
        }
        String engineType1 = sc.next();
        String engineName1 = sc.next();
        System.out.println(findAvgEnginePriceByType(engines, engineType1));
        System.out.println(searchEngineByName(engines, engineName1));
    }

    public static double findAvgEnginePriceByType(Engine[] engines, String engineType) {
        double totalPrice = 0.0;
        double count = 0;
        for (int i = 0; i < engines.length; i++) {
            if (engines[i].getEngineType().equals(engineType)) {
                totalPrice += engines[i].getEnginePrice();
                count++;
            }
        }
        if (count == 0)
            return 0;
        else
            return totalPrice / count;
    }

    public static List<Integer> searchEngineByName(Engine[] engines, String engineName) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < engines.length; i++) {
            if (engines[i].getEngineName().equals(engineName)) {
                list.add(engines[i].getEngineId());
            }
            Collections.sort(list);
        }
        if (engineName == null)
            return null;
        else
            return list;
    }

}
