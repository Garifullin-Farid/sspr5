package test;

public class MatrixAppTests {
    public static void main(String[] args) {
        testFindMaxElement_case1();
        testFindMaxElement_case2();
        testFindMaxElement_case3();
        testFindMaxElement_case4();
        testFindMaxElement_case5();
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

    public static void testFindMaxElement_case1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = findMaxElement(matrix);
        System.out.println(9 == result);
    }

    public static void testFindMaxElement_case2() {
        int[][] matrix = {
                {-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}
        };
        int result = findMaxElement(matrix);
        System.out.println(-1 == result);
    }

    public static void testFindMaxElement_case3() {
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int result = findMaxElement(matrix);
        System.out.println(0 == result);
    }

    public static void testFindMaxElement_case4() {
        int[][] matrix = {
                {42}
        };
        int result = findMaxElement(matrix);
        System.out.println(42 == result);
    }

    public static void testFindMaxElement_case5() {
        int[][] matrix = {
                {5, 5, 5},
                {5, 5, 5},
                {5, 5, 5}
        };
        int result = findMaxElement(matrix);
        System.out.println(5 == result);
    }
}
