package homework13;

/**
 * Java. Homework №13.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 12.12.2022 - 15.12.2022
 */

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("hello", "welcome", "java", "bye", "day"));
        System.out.println(stringList);
        Set<String> treeSet = new TreeSet<>(stringList);
        System.out.println(treeSet);

        //implements Comparable<Person>
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("Mike", 38),
                new Person("John", 35),
                new Person("Luke", 28),
                new Person("Mike", 23)));
        System.out.println(personList);

        Set<Person> personSet = new TreeSet<>(personList);
        System.out.println(personSet);

        // create own comparator(s)
        Comparator<Person> comparatorAge = new ComparatorAge();
        Comparator<Person> comparatorName = new ComparatorName();

        Set<Person> ageSortedSet = new TreeSet<>(comparatorAge);
        ageSortedSet.addAll(personList);
        System.out.println(ageSortedSet);

        personList.sort(comparatorName);
        System.out.println(personList);

        //concat two and more comparators
        Comparator<Person> compareNameAge = new ComparatorName().thenComparing(new ComparatorAge());
        personList.sort(compareNameAge);
        System.out.println(personList);
    }
}
