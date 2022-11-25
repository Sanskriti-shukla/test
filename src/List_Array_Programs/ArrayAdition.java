package List_Array_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAdition {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> addition = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    sum = sum + list.get(j);
                }
            }
            System.out.println(sum);
            addition.add(sum);
            System.out.println(addition);

        }
        System.out.println(MinElement(addition));

    }

    private static int MinElement(List<Integer> addition) {
        if (addition == null || addition.size() == 0) {
            return Integer.MIN_VALUE;

        }
        return Collections.min(addition);


    }


}




