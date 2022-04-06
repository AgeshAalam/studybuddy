package java8_practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {

      List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3);
        /*List<Integer> lists=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .collect(Collectors.toList());
                //.forEach(System.out::println);
        System.out.println(lists);*/
List<Integer> modifiedList=new ArrayList<>();
        for (int i:list) {
            if(!modifiedList.contains(i)){
                modifiedList.add(i);
            }
        }
        System.out.println(modifiedList);

    }
}