package List_Array_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class listSort {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("T");
        a.add("S");
        a.add("P ");
        a.add(null);
        Collections.sort((a));
        System.out.println(a);
        Collections.reverse((a));
        System.out.println(a);
    }
}
