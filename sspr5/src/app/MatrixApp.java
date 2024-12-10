package app;

import java.util.Scanner;

public class MatrixApp {
    public MatrixApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxElement = findMaxElement(matrix);
        System.out.println("Максимальный элемент в матрице: " + maxElement);
    }

    public static int findMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE; // Инициализируем максимальное значение минимально возможным значением

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value; // Обновляем максимальное значение, если найдено большее
                }
            }
        }

        return max;
    }
}
