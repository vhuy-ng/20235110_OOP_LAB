package bai_6_6;

public class Bai6_6 {
    public static void main(String[] args) {
        int[][] matA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] resMat = addMat(matA, matB);
        
        System.out.println("Ma tran A:");
        printMat(matA);
        
        System.out.println("Ma tran B:");
        printMat(matB);
        
        System.out.println("Ma tran ket qua:");
        printMat(resMat);
    }
    
    public static int[][] addMat(int[][] matA, int[][] matB) {
        int rows = matA.length;
        int cols = matA[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matA[i][j] + matB[i][j];
            }
        }
        
        return result;
    }
    
    public static void printMat(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
