package StringsInterviewPractise;

public class StringBufferr {

    public static void main(String[] args) {
     StringBufferr.createString();
    // StringBufferr.createSB();

    }
    public static void createSB(){
        StringBuffer sb=new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
    }
    public static void createString(){
        String s="hi";
        String s1=new String("hello");
        s.concat("welcome");
        System.out.println(s);
    }
}
