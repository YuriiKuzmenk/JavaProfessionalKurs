package homework14;

/**
 * Java. Homework №14.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 15.12.2022 - 19.12.2022
 */

import java.util.HashMap;
import java.util.Map;

public class Lesson14 {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("Kyiv", "Ukraine");
        hashTable.put("Paris" , "France");
        hashTable.put("Moscow" , "Russian Federation");
        hashTable.put("Berlin" , "Germany");
        hashTable.put("Prague" , "Czech Republic");
        hashTable.put("Warsaw" , "Poland");
        hashTable.put("Madrid" , "Spain");

        System.out.println(hashTable.get("Kyiv"));
        System.out.println(hashTable.get("Paris"));
        System.out.println(hashTable.get("Moscow"));
        System.out.println(hashTable.get("Berlin"));
        System.out.println(hashTable.get("Prague"));
        System.out.println(hashTable.get("Warsaw"));
        System.out.println(hashTable.get("Madrid"));
/*
        System.out.println(hashTable.get("Ukraine"));
        System.out.println(hashTable.get("France"));
        System.out.println(hashTable.get("Russian Federation"));
        System.out.println(hashTable.get("Germany"));
        System.out.println(hashTable.get("Czech Republic"));
        System.out.println(hashTable.get("Poland"));
        System.out.println(hashTable.get("Spain"));
*/
        System.out.println(hashTable);
    }
    static void before() {
        Map<String, String> map = new HashMap<>();
        map.put("Kyiv" , "Ukraine");
        map.put("Paris" , "France");
        map.put("Moscow" , "Russian Federation");
        System.out.println(map);
        System.out.println(map.get("Kyiv"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        Integer integer = 1;

        /*
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        ex(hashSet);
        ex(arrayList);
        ex(linkedList);
    }

    private static void ex(Collection<Integer> list) {
        //TODO
    }

 */
    }
}