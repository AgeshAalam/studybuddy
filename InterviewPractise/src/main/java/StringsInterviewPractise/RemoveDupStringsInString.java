package StringsInterviewPractise;

public class RemoveDupStringsInString {
    public static void main(String[] args) {
        String string="hi hello welcome to hi from hello";
        String[] str=string.split(" ");
        for(int i=0;i< str.length-1;i++){
            if(!str[i].equals(str[i+1])){
                System.out.println(str.toString());
            }
        }
    }
}
