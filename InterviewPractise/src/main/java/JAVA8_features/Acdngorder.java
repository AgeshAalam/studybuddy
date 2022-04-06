package JAVA8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Acdngorder {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(01);
        list.add(-11);
list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
