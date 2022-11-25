package List_Array_Programs;
// Find Average by storing the data in list...
import java.util.ArrayList;
public class Average1 {
    public static void main(String[] args) {
        int sum = 0, average = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(10);
        list.add(48);
        list.add(65);

        for (Integer integer : list) {
            sum = sum + integer;
        }
////        logic for finding average....
        average = sum / list.size();
        System.out.println(average);

    }
}
