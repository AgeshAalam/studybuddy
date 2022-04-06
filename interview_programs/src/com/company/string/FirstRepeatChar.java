package com.company.string;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/*Print first repeating character in a string */
public class FirstRepeatChar {
    public static void main(String[] args) {
        /*String string="abovebove";
        char[] c=string.toCharArray();
        for (int i = 0; i < c.length ; i++) {
            for (int j = i+1; j <c.length ; j++) {
                if(c[i]==c[j])
                System.out.println(c[j]);
                else {
                    continue;
                }
            }*/

        String string ="helloo";
        Map<Character, Long> collect =  string.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
    }
}

