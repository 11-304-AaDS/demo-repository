package FindIndexEqualsElement_3;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15};
        //                   0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10
        int[] sortedArray2 = {-5, -3, 1, 2, 3, 4, 6, 10, 12, 14, 15};
        //                     0,  1, 2, 3, 4, 5, 6,  7,  8,  9, 10
        int[] sortedArray3 = {-5, -3, 1, 3, 4, 6, 7, 10, 12, 14, 15};
        //                     0,  1, 2, 3, 4, 5, 6,  7,  8,  9, 10

        System.out.println(function(sortedArray));
        System.out.println(function(sortedArray2));
        System.out.println(function(sortedArray3));
    }

    public static int function(int[] array) {
        return function(array, 0, array.length - 1);
    }

    private static int function(int[] array, int start, int end) {
        if (start == end) return (array[start] == start) ? array[start] : -1;
        int i = start + (end - 1) / 2;

        if (i > array[i]) return function(array, start + 1, end);
        else if (i < array[i]) return function(array, start, end - 1);
        return array[i];

    }
}
