package hw2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

//        invertArray();
//        Array();
//        Array2();
        Array2D();


    }


//   1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    2. Задать пустой целочисленный массив размером 8.
//       С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void Array() {
        int[] arr = new int[8];
        byte j=0;
        arr[0]=0;
        for (byte i = 1; i < arr.length; i++) {
            arr[i]=j+=3;
        }
        System.out.println(Arrays.toString(arr));
    }
//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//       пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void Array2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//   4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        public static void Array2D() {
            int[][] arr2d = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == j) {
                        arr2d[i][j] = 1;
                    }
                    if (i+j == 9) {
                        arr2d[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < arr2d.length; i++) {
                System.out.println(Arrays.toString(arr2d[i]));
            }


        }
}