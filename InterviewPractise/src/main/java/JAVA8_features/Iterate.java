package JAVA8_features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(100,e->e+1).collect(Collectors.toList()));
    }
}
