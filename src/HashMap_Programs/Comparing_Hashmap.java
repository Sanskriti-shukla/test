package HashMap_Programs;

import java.util.HashMap;
import java.util.Map;

public class Comparing_Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("Sarthak", 20);
        hashmap.put("Savan", 19);
        hashmap.put("Dency", 19);
        hashmap.put("Alfaz", 22);

        HashMap<String, Integer> hashmap1 = new HashMap<String, Integer>();
        hashmap1.put("Sanket", 30);
        hashmap1.put("Dhaval", 21);
        hashmap1.put("Akash", 22);
        hashmap1.put("Aman", 28);
        hashmap1.put("Niyati", 30);
        hashmap1.put("Riya", 23);
        hashmap1.put("Ankit", 22);

        HashMap<String, HashMap<String, Integer>> Map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            String key = entry.getKey();
            HashMap<String, Integer> map = new HashMap<>();
            for (java.util.Map.Entry<String, Integer> stringIntegerEntry1 : hashmap1.entrySet()) {
                String str3 = stringIntegerEntry1.getKey();
                if (key.charAt(0) == str3.charAt(0)) {
                    if (stringIntegerEntry1.getValue() > 22)
                        map.put(stringIntegerEntry1.getKey(), stringIntegerEntry1.getValue());
                }
            }
            Map.put(entry.getKey(), map);
        }
        System.out.println(Map);
    }

}



