package Perepelkin.HW4.java2;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Васильев", "8-956-465-5255");
        pb.add("Иванов", "8-616-161-4646");
        pb.add("Дементьев", "8-212-544-8998");

        System.out.println(pb.get("Васильев"));
    }
}
