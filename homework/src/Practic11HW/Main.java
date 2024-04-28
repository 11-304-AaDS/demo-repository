package Practic11HW;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6};
        int index = task(array, 0, array.length - 1);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("такого элемента нет");
        }
    }

    public static int task(int[] array, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;

        if (array[mid] == mid) {
            return mid;
        } else if (array[mid] < mid) {
            return task(array, mid + 1, e);
        } else {
            return task(array, s, mid - 1);
        }
    }
}
