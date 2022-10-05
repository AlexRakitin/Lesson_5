import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Lesson_5 {
    public static void main(String[] args) {
//        1. Создать трехмерный массив из целых чисел.
//        С помощью циклов "пройти" по всему массиву и увеличить каждый
//        элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.

        System.out.println("******ЗАДАЧА_1******");
        int[][][] massiveFirst = {
                {{1, 2, 3, 4}, {10, 20, 30, 40}},
                {{100, 200, 300, 400}}
        };


        System.out.print("Введите число: ");
        Scanner typeOne = new Scanner(System.in);
        int typeScannerOne = typeOne.nextInt();

        int scannerOne = 0;
        for (int[][] massiveFirstOne : massiveFirst) {
            for (int[] massiveFirstSecond : massiveFirstOne) {
                for (int massiveFirstThird : massiveFirstSecond) {
                    scannerOne = massiveFirstThird + typeScannerOne;
                    System.out.print(scannerOne + " ");
                }
                System.out.println();
            }
        }
        out.println("Нажмите любю кнопку для перехода на следующую задачу \n");
        Scanner enter = new Scanner(System.in);
        String enterOne = enter.nextLine();

//        3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
//        всех элементов массива.
        System.out.println("******ЗАДАЧА_3******");
        int[][] massiveThird = {{1, 2, 3}, {10, 20, 30}};
        int sumSecond = 0;
        for (int i = 0; i < massiveThird.length; i++) {
            for (int j = 0; j < massiveThird[i].length; j++) {
                sumSecond+=massiveThird[i][j];
                System.out.println(sumSecond+" ");
            }

        }

    }


}



