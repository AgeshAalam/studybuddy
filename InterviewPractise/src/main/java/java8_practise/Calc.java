package java8_practise;

 interface Calc {
    int add(int i, int j);
}
 class Calculator implements Calc {
    public static void main(String[] args) {

        Calc calc=(int i, int j) ->(j-i);
        System.out.println(calc.add(10,15));
    }

    public int add(int i, int j) {
       return 0;
    }
 }
