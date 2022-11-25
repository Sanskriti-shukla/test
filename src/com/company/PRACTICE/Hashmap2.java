package com.company.PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> Map= new HashMap<Integer,String>();
        Map.put(100, "Sans");
        Map.put(200, "Sans");
        Map.put(300, "Sans");
        Map.put(400, "Sans");
//        System.out.println(Map);

//        System.out.println(  Map.get(100));
//        Map.remove(100);
//
//        Map.putIfAbsent(500,"Mani");
//        System.out.println(Map);
//        System.out.println(Map.keySet());
//        System.out.println(Map.values());
//        System.out.println(Map.containsKey(100));
//        System.out.println(Map.clone());
//        System.out.println(Map.entrySet());
//        for (java.util.Map.Entry<Integer, String> integerStringEntry : Map.entrySet()) {
//            System.out.println(Map);
//        }
//        Map.clear();

        System.out.println(Map.isEmpty());
    /*    System.out.println(Map);*/
  Map.replace(100,"Sans","NAVI");
        System.out.println( Map);
        System.out.println(Map.size());
        System.out.println(  Map.equals(100==200));

    }
}
