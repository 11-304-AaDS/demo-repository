package ru.kpfu.itis.kirillakhmetov.work;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {-189, -1, 1, 2, 4, 19, 6, 22};
        System.out.println(findElem(arr, 0, arr.length-1));
    }

    public static int findElem(int[] arr, int st, int end) {
        if (st > end) {
            return -1;
        }

        int m = (st + end) / 2;

        if (arr[m] == m) {
            return m;
        } else if (arr[m] < m) {
            return findElem(arr, m + 1, end);
        } else {
            return findElem(arr, st, m - 1);
        }
    }
}