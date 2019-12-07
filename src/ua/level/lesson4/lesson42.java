package ua.level.lesson4;

public class lesson42 {
    public static void main (String[] args) {

        int[] fibbonachi = new int[11]; // обьявляем целочисленный массив из 11 элементов
        fibbonachi[0] = 1;
        fibbonachi[1] = 1;


        for (int i = 2; i < fibbonachi.length; i++) {           // заполняем массив числами Фибоначчи
            fibbonachi[i] = fibbonachi[i - 1] + fibbonachi[i - 2];
        }

        for (int i = 0; i < fibbonachi.length; i++) {
            System.out.println(fibbonachi[i]);
        }
    }
}
