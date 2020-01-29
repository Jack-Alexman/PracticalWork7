package work72;

public class Task72 {
    public static int sumOddElementsArray(int[]  array){
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                return -1;
            }
            if ((array[i] > 0) && (array[i] % 2 != 0)){
                sumOdd += array[i];
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOddElementsArray(result));
    }
}
