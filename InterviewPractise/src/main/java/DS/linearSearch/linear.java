package DS.linearSearch;

public class linear {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 55, 2, 765, 3};
       int ans= linearSearching(intArray, 9);
        System.out.println("ans = " + ans);
    }

    static int linearSearching(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
           if(array[index]==target){
           return index;
}

        }
        return -1;
    }

}