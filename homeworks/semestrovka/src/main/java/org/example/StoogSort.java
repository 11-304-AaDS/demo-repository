package org.example;
public class StoogSort {
    private static int count = 0;
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

        // Если в массиве более двух элементов
        if (high - low + 1 > 2) {
            //Чему равна одна треть?
            int t = (high - low + 1) / 3;

            // Рекурсивно сортируем первые 2/3 элемента
            sort(array, low, high - t);

            // Рекурсивно сортируем последние 2/3 элемента
            sort(array, low + t, high);

            // Снова рекурсивно сортируем первые 2/3 элемента
            sort(array, low, high - t);
        }
        return count;
    }

}

