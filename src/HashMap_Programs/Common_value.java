package HashMap_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Common_value {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(90);
        list.add(100);
        list.add(11);

        HashMap<String, List<Integer>> data1 = new HashMap<String, List<Integer>>();
        data1.put("Sans", list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(45);
        list1.add(90);
        list1.add(100);
        list1.add(191);
        HashMap<String, List<Integer>> data2 = new HashMap<String, List<Integer>>();
        data2.put("Sans", list1);
        for (Map.Entry<String, List<Integer>> stringListEntry : data1.entrySet()) {
            Map<List<Integer>, List<Integer>> common = new HashMap<>();
            String str = stringListEntry.getKey();
//            method 1-
            if (data2.containsKey(str)) {
                list1.retainAll(list);
                System.out.println(str + "=" + list1);
            }
//           Method -2
//            for (java.util.Map.Entry<String, List<Integer>> listEntry : data2.entrySet()) {
//                if (str.equals(listEntry.getKey())) {
//                    list1.retainAll(list);
//                    System.out.println(str+"=" +list1);
//                    }
        }
    }

}








