package List_Array_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 4, 6, 6,6,9,9,9);
        for (Integer integer : list) {
        Collections.frequency(Collections.singleton(integer),list);
     } }}
