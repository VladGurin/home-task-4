package ua.level.lesson4;

import java.util.Random;

public class lesson4 {
    public static void main(String[] args) {

        int[][] myArray = new int[3][3]; // создаем двухмерный массив - матрицу
// fill array

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArray[i][j] = (int) Math.round(Math.random() * 200); // генерируем случайные числа, умножаем на 200
                // округляем и делаем его Integer
                System.out.print(myArray[i][j] + " ");  // выводим на экран построчно
            }
            System.out.println();
        }
        // умножение диагональных элементов матрицы - слева направо и сверху вниз
        int mult = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    mult = mult * myArray[i][j];
                }

            }
        }
        System.out.println("Multiplication of main diagonal: " + mult);

        int sum = 0;// вычисляем сумму второй строки массива
        for (int j = 0; j < 3; j++) {
            sum = sum + myArray[1][j]; // вычисляем сумму второй строки массива - вторая строка начиная с нуля
        }
        System.out.println("Summ of elements of second string = " + sum);

        int sumAll = 0;// вычисляем сумму элементов всего массива
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumAll = sumAll + myArray[i][j];
            }
        }

        System.out.println("Summ of elements of all array = " + sumAll);

        long mult1 = 1;
        for (int i = 2; i >= 0; i--) {             // перебираем элементы массива в обратном порядке
            for (int j = 2; j >= 0; j--) {
                mult1 = mult1 * myArray[i][j];  // перемножаем все элементы матрицы
            }
        }
        System.out.println("Result of multiplication of all elements  = " + mult1);

        int mult2 = 1;
        for (int i = 0; i < 3; i++) {             // находим произведение элементов обратной диагонали
            for (int j = 2; j >= 0; j--) {
                if (i + j == 2) {
                    mult2 = mult2 * myArray[i][j];  // перемножаем все элементы матрицы
                }
            }
        }
        System.out.println("Result of multiplication of reverse diagonal  = " + mult2);


    }
}
