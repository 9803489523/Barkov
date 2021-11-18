import java.io.IOException;
import java.util.Scanner;

public class L_1 {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность матрицы в формате: M N");
        int m=reader.nextInt();
        int n=reader.nextInt();
        int[][] myMatrix = new int[m][n];
        int[][] matrix = new int[m+1][n];
        int[] maximums=new int[n];
        inputMatrix(myMatrix);
        for (int[] ints : myMatrix) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > maximums[j])
                    maximums[j] = ints[j];
            }
        }
        for(int i=0;i< myMatrix.length;i++){
            System.arraycopy(myMatrix[i], 0, matrix[i], 0, myMatrix[i].length);
        }
        System.arraycopy(maximums, 0, matrix[m], 0, maximums.length);
        myMatrix=matrix;
        System.out.println("Результат: ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        reader.close();
    }
    public static void inputMatrix(int[][] matrix) throws IOException {
        System.out.println("Введите значения матрицы ");
        for(int i=0;i< matrix.length;i++){
            for(int j=0; j< matrix[i].length;j++){
                matrix[i][j]=reader.nextInt();
            }
        }
        System.out.println("Введеная матрица");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
