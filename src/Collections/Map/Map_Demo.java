package Collections.Map;

// Java code to illustrate the entrySet() method

import java.util.*;

public class Map_Demo {
    public static void main(String[] args)
    {
        // Creating an empty Map
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        map.put(10, "Java");
        map.put(15, "4");
        map.put(20, "World");
        map.put(25, "Welcomes");
        map.put(30, "You");


        Set < Map.Entry<Integer, String> > setconv = map.entrySet();

        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);

        // Using entrySet() to get the set view
        System.out.println("The set is: " + setconv);


        for (Map.Entry entry : map.entrySet()) {
            System.out.println("The key is: " + entry.getKey());
            System.out.println("The value is: " + entry.getValue());

        }



    }
}
