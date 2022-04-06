package JAVA8_features;

import java.util.*;
import java.util.stream.Collectors;

public class DataStartsWith {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("zebra");
        list.add("hello");
        list.add("frog");
        list.add("buff");
        list.add("ahan");
        list.add("lizard");
        list.add("buffalo");
        list.add("zebra");
        list.add("buffalo");

        //StartsWith
      //  System.out.println( list.stream().filter(s -> s.startsWith("h")).collect(Collectors.toList()));

        list.stream().filter(s->s.startsWith("h")).forEach(System.out::println);

        /*toSet*/
        // System.out.println(list.stream().collect(Collectors.toSet()));
        System.out.println(new HashSet<>(list));

list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
