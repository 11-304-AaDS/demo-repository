package ru.itis.inf304;

public class Dz3 {
    public static void main(String[] args) {
        int[] a = {-2, 0, 1, 2, 4, 26, 56, 78};

        int result = f(a, 0, a.length - 1);

        if (result == -1) {
            System.out.println("нет таких чисел");
        }
        else {
            System.out.println("результат поиска : " + result);
        }

    }
    public static int f(int[] a, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == mid) {
                return mid;
            } else if (a[mid] < mid) {
                return f(a, mid + 1, right);
            } else {
                return f(a, left, mid - 1);
            }
        }
        return -1;
    }
}
