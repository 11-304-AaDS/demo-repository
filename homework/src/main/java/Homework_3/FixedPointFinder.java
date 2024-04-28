package Homework_3;

public class FixedPointFinder {
    public static int findFixedPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 3, 7, 5, 11, 12, 13, 20, 25, 146, 215};
        int result = findFixedPoint(arr);
        if (result != -1) {
            System.out.println("Индекс: " + result);
        } else {
            System.out.println("Такого i не существует");
        }
    }
}