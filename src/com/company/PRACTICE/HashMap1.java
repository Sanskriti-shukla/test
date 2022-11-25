package com.company.PRACTICE;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {

//        Declaring hashmap....
        HashMap<Integer,String> map= new HashMap<Integer,String>();

//        Storing value in HashMap by using put......
        map.put(1,"Manisha");
        map.put(2,"Manisha");
        map.put(3,"Manisha");
        map.put(4,"Manisha");

        System.out.println(map);

//        Updating value of hashmap...
        map.put(2, "hey");
        map.put(2,"Techrover");


//       Searching key and value from HashMap using containsKey Method....
     System.out.println(map.containsKey("des"));

//     by doing this we can get print the value of key like 3 store the value of Manisha....
     System.out.println(map.get(3));
        System.out.println(map.get(4));




//        We are using for loop for iteration.....
        for (Map.Entry<Integer, String> e : map.entrySet()) {
        System.out.println(e.getKey()+" "+e.getValue());
        }

//        We are using remove function for removing the value of key 3....
  map.remove(3);
        System.out.println(map);


//        We can do the iteration of key only by using-- map.keyset()...!

        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }



//         We can do the iteration of value only by using-- map.values()...!


        for (String value : map.values()) {
            System.out.println(value);
        }
// If we use putIfAbsent method it's means that if the data is not present in that it will stored there....
        map.put(4,"Sarthak");
        System.out.println(map);



    } }

