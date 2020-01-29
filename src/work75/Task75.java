package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static int[] countOfSequenceNumbers(String numbers){
        int[] result = new int[9];
        for (int i = 1; i <= 9; i++){
            int count = 0;
            for (char a : numbers.toCharArray()) {
                if (Integer.parseInt(Character.toString(a)) == i){
                    count++;
                }
                result[i-1] = count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку чисел => ");
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(Arrays.toString(countOfSequenceNumbers(s)));
    }
}