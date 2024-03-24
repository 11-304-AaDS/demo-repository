package org.example;

public class StoogeSortWithCountOperations {
    static int count = 0;
    public static int sort(int[] array, int low, int high) {

        //Сравниваем / меняем элементы на концах отрезка
        if (array[low] > array[high]) {
            int t = array[low];
            array[low] = array[high];
            array[high] = t;
            count++;
        }

        //Меньше трёх?
        if(low + 1 >= high) {
            return count;
        }

        //Чему равна одна треть?
        if (high - low + 1 > 2) {
            int t = (high - low + 1) / 3;

            // Recursively sort first 2/3 elements
            sort(array, low, high - t);

            // Recursively sort last 2/3 elements
            sort(array, low + t, high);

            // Recursively sort first 2/3 elements
            // again to confirm
            sort(array, low, high - t);
        }
        return count;
    }

}
