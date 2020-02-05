package work72;

public class Task72 {
    public static int sumOddElementsArray(int[]  array){
        if (array == null || array.length <= 1) {
            return -1;
        }
        int sumOdd = 0;
        for (int value : array) {
            if ((value > 0) && (value % 2 != 0)) {
                sumOdd += value;
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOddElementsArray(result));
    }
}
