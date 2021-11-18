import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class L_4 {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размерность массива");
        int size=reader.nextInt();
        int[] array=new int[size];
        inputArray(array);
        int minIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        int counter=0;
        int indexThirdNegative=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                counter++;
            }
            if(counter==3){
                indexThirdNegative=i;
                break;
            }
        }
        counter=array[minIndex];
        array[minIndex]=array[indexThirdNegative];
        array[indexThirdNegative]=counter;
        System.out.println("Результат");
        System.out.println(Arrays.toString(array));

    }
    public static void inputArray(int[] array) throws IOException {
        System.out.println("Введите значения массива ");
        for(int i=0;i< array.length;i++){
                array[i]=reader.nextInt();

        }
        System.out.println("Введеный массив");
        System.out.println(Arrays.toString(array));
    }
}
