package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static int[] countOfSequenceNumbers(String numbers){
        int[] result = new int[10];
        String digits = "0123456789";
        for (int i = 0; i < numbers.length(); i++){
            char symbol = numbers.charAt(i);
            int index = digits.indexOf(symbol);
            if (index != -1) {
                result[index]++;
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