package HashMap_Programs;

import java.util.HashMap;
import java.util.Map;

public class Average {
    public static void main(String[] args) {
        int sum = 0, average = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("sans", 12);
        hashMap.put("dency", 34);
        hashMap.put("sarthk", 10);
        hashMap.put("savaan1", 48);
        hashMap.put("savan", 65);
        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {
            sum += stringIntegerEntry.getValue();

        }
        average = sum / hashMap.size();
        System.out.println(average);

    }

}

