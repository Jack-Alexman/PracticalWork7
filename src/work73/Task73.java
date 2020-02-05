package work73;

import java.util.Arrays;
import java.util.Scanner;

import static work71.Task71.createArray;

public class Task73 {
    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        int e = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[j][i] = ++e;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы => ");
        int size = scanner.nextInt();
        scanner.close();
        int [][] matr = createMatrix(size);
        for (int[] ints : matr) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
