package Tugas12;

import java.util.Arrays;

public class Main {

    // Pengurutan secara ASCENDING berarti mengurutkan dari kecil ke besar
    // Pengurutan secara DESCENDING berarti mengurutkan dari besar ke kecil

    public static void ascendingBubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void ascendingSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void ascendingInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void descendingBubbleSort(int[] array) {
        // Modifikasi bagian ini
        for (int i = array.length - 1; i > 0; i--) {
          for (int j = 0; j < i; j++) {
              if (array[j] < array[j + 1]) {
                  int temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
              }
          }
      }
    }

    public static void descendingSelectionSort(int[] array) {
        // Modifikasi bagian ini
        for (int i = 0; i < array.length; i++) {
          int maxIndex = i;
          for (int j = i + 1; j < array.length; j++) {
              if (array[j] > array[maxIndex]) {
                  maxIndex = j;
              }
          }
          if (i != maxIndex) {
              int temp = array[i];
              array[i] = array[maxIndex];
              array[maxIndex] = temp;
          }
      }
    }

    public static void descendingInsertionSort(int[] array) {
        // Modifikasi bagian ini
        for (int i = 1; i < array.length; i++) {
          int temp = array[i];
          int j = i - 1;
          while (j > -1 && temp > array[j]) {
              array[j + 1] = array[j];
              array[j] = temp;
              j--;
          }
      }
    }

    public static void main(String[] args) {

        int[] myArrayOne = { 4, 2, 6, 5, 1, 3 };
        int[] myArrayTwo = { 7, 9, 8, 12, 11, 10 };
        int[] myArrayThree = { 18, 13, 17, 15, 14, 16 };

        System.out.println("====ASCENDING====");
        ascendingBubbleSort(myArrayOne);
        ascendingSelectionSort(myArrayTwo);
        ascendingInsertionSort(myArrayThree);

        System.out.println(Arrays.toString(myArrayOne));
        System.out.println(Arrays.toString(myArrayTwo));
        System.out.println(Arrays.toString(myArrayThree));

        System.out.println("====DESCENDING====");
        descendingBubbleSort(myArrayOne);
        descendingSelectionSort(myArrayTwo);
        descendingInsertionSort(myArrayThree);

        System.out.println(Arrays.toString(myArrayThree));
        System.out.println(Arrays.toString(myArrayTwo));
        System.out.println(Arrays.toString(myArrayOne));
    }

}
