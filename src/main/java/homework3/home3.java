package homework3;
import java.util.Arrays;


public class home3 {
    public static void main(String[] args) {

        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(chenging01(array01)));
        int[] arr = new int[101];

        int[] arra = new int[101];
        for (int i = 0; i < 101; i++) {
            arra[i] = i;
            System.out.println("arr[" + i + "] = " + arra[i]);
        }


        createSquareArray(5);

        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int[] minMaxArray = {6, 6, 8, 12, 45, 100, 145, 220, 6, 8, 99, 3, 7};
        System.out.println(minInArray(minMaxArray));
        System.out.println(maxInArray(minMaxArray));
    }

    public static int[] chenging01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;

    }

    public static void createSquareArray(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void modifierForArrayes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }


    }
