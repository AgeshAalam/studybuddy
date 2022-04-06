package StringsInterviewPractise;

import java.util.ArrayList;
import java.util.List;

public class samp {
   public static void main(String[] args) {
      String string=new String("hell,hoo,hee");
     string= string.replaceAll(",",":");
      System.out.println("string = " + string);
   }
}
class hello{
   public static void main(String[] args) {
      List<Object> list=new ArrayList<>();
      list.add(1);
      list.add("hi");
      System.out.println("list = " + list);
   }
}