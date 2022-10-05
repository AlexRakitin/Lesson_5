import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Lesson_5 {
    public static void main(String[] args) {
        out.println("1. Создать трехмерный массив из целых чисел.\n" +
                "С помощью циклов пройти по всему массиву и увеличить каждый\n" +
                "элемент на заданное число. Пусть число, на которое будет\n" +
                "увеличиваться каждый элемент, задается из консоли.\n");

        System.out.println("******ЗАДАЧА_1******");

        int[][][] massiveFirst = {
                {{1, 2, 3, 4}, {10, 20, 30, 40}},
                {{100, 200, 300, 400}}
        };
        System.out.println(Arrays.deepToString(massiveFirst));

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


        out.println("Нажмите любю кнопку для перехода на следующую задачу 2 \n");
        Scanner enter = new Scanner(System.in);
        String enterOne = enter.nextLine();
        System.out.println("******ЗАДАЧА_2******");

        out.println("2.Шахматная доска \n" +
                "Создать программу для раскраски шахматной доски с помощью цикла.\n" +
                "Создать двумерный массив String'ов 8х8. С помощью циклов задать\n" +
                "элементам циклам значения B(Black) или W(White)\n");

        String[][] massiveTwo = new String[8][8];

        for (int i = 0; i < massiveTwo.length; i++) {
            for (int j = 0; j < massiveTwo[i].length; j += 2) {
                if (i == 0 || i % 2 == 0) {
                    massiveTwo[i][j] = "W";
                    massiveTwo[i][j + 1] = "B";
                } else {
                    massiveTwo[i][j] = "W";
                    massiveTwo[i][j + 1] = "B";
                }
            }
        }


        for (int i = 0; i < massiveTwo.length; i++) {
            for (int j = 0; j < massiveTwo[i].length; j++) {
                out.print(massiveTwo[i][j] + " ");
            }
            out.println();

        }


        out.println("Нажмите любю кнопку для перехода на следующую задачу 3 \n");
        String enterTwo = enter.nextLine();

        out.println("3.Создайте двумерный массив целых чисел. Выведите на консоль сумму \n" +
                        "всех элементов массива \n");
        System.out.println("******ЗАДАЧА_3******");
        int[][] massiveThird = {{1, 2, 3}, {10, 20, 30}};
        System.out.println(Arrays.deepToString(massiveThird));
        int sumSecond = 0;
        for (int i = 0; i < massiveThird.length; i++) {
            for (int j = 0; j < massiveThird[i].length; j++) {
                sumSecond += massiveThird[i][j];
                System.out.println(sumSecond + " ");
            }

        }

    }
}






