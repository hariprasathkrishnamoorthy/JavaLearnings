package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrayLists {
    public static List<Integer> findIntersection(List<Integer> listA, List<Integer> listB) {
        List<Integer> intersection = new ArrayList<>();

        for (Integer element : listA) {
            if (listB.contains(element)) {
                intersection.add(element);
            }
        }

        return intersection;
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

        List<Integer> result = findIntersection(listA, listB);

        System.out.println("Intersection of listA and listB: " + result);
    }
}

