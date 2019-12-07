package ua.level.lesson4;

public class lesson43 {
    public static void main(String[] args) {

        int[] arrayToSort = {2, 6, 3, -5, 7, 11, 4};  // Bubble Sort
        int x;
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = arrayToSort.length - 1; j > i; j--) {

                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    x = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = x;
                }
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);  
        }
    }
}
