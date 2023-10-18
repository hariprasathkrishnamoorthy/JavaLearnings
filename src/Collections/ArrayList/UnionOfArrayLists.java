package Collections.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionOfArrayLists {
    public static List<Integer> findUnion(List<Integer> listA, List<Integer> listB) {
        // Create a HashSet to store the union of elements
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements from listA to the unionSet
        unionSet.addAll(listA);

        // Add all elements from listB to the unionSet
        unionSet.addAll(listB);

        // Convert the unionSet back to a List
        List<Integer> unionList = new ArrayList<>(unionSet);

        unionList.addAll(unionSet);

        return unionList;
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

        List<Integer> result = findUnion(listA, listB);

        System.out.println("Union of listA and listB: " + result);
    }
}
