package Interface_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Numbers {
    void FindAvg(List<Integer> list);

    void FindHighest(List<Integer> list);

    void FindMin(List<Integer> list);
}

class Average_1 implements Numbers {

    @Override
    public void FindAvg(List<Integer> list) {
        int sum = 0, average;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        average = sum / list.size();
        System.out.println(average);
    }

    @Override
    public void FindHighest(List<Integer> list) {
        int max = Collections.max(list);
        System.out.println(max);
    }

    @Override
    public void FindMin(List<Integer> list) {
        int min = Collections.min(list);
        System.out.println(min);
    }


}

class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(10);
        list.add(48);
        list.add(65);
        Numbers N = new Average_1();
        N.FindAvg(list);
        N.FindHighest(list);
        N.FindMin(list);
    }

}