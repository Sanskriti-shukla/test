package HashMap_Programs;

import java.util.HashMap;

public class Hashmap_Avg {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sans", 12);
        map.put("Kristi", 10);
        map.put("Shukla", 34);
        map.put("Mani", 48);
        map.put("Priya", 65);
        int sum = 0, average = 0;
        for (Integer value : map.values()) {

            sum = sum + value;
        }
        average = sum / map.size();
        System.out.println(map.values());
        System.out.println(" Average" + "=" + average);
    }
}
