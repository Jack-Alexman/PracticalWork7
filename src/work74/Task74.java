package work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void transpositionMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = i+1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[j][i] = (int)(Math.random() * 50);
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            System.out.print("[");
            for (int elem : row){
                System.out.print(String.format("%3d", elem));
            }
            System.out.println(" ]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы => ");
        int size = scanner.nextInt();
        scanner.close();
        int [][] matr = createMatrix(size);
        printMatrix(matr);
        transpositionMatrix(matr);
        System.out.println("Транспонирование матрицы => => => ");
        printMatrix(matr);
    }
}
