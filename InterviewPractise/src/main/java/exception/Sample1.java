package exception;

public class Sample1 {
    static String name="hello";
    final int o=1;
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k=i/j;
        try {
            System.out.println(k);

        } catch (Exception e) {
            e.printStackTrace();
        }/*catch (ArithmeticException ae)
        {
            System.out.println("divide by zzero");
        }*/
    }
}
