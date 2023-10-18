package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfArrayLists {
    public static List<Integer> findDifference(List<Integer> listA, List<Integer> listB) {
        List<Integer> difference = new ArrayList<>();

        for (Integer element : listA) {
            if (!listB.contains(element)) {
                difference.add(element);
            }
        }

        return difference;
    }

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        List<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);

        List<Integer> result = findDifference(listA, listB);

        System.out.println("A - B (Difference of listA and listB): " + result);
    }
}
