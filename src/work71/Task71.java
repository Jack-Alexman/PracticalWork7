package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static int[] createArray(int  size){
        int [] result = new int[size];
        for (int i = 0; i < result.length; i++){
            result[i] = i + 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива => ");
        int size = scanner.nextInt();
        scanner.close();
        int [] arr = createArray(size);
        System.out.println(Arrays.toString(arr));
    }

}
