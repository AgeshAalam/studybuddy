package StringsInterviewPractise;

public class RemoveDupUsingFor {
    public static void main(String[] args) {
        String s="hello welcome to hello from welcome";
        int count=1;
        String[] chars=s.split(" ");
        for (int i=0;i<chars.length;i++){
            for (int j=i+1;j<chars.length;j++){
                if(chars[i].equals(chars[j])){
                    count++;
                    chars[j]="0";
                }
            }if(count>1 && chars[i]!="0")
                System.out.println(chars[i]);
        }
    }
}
