package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 4, 6, 7, 7, 7};
        System.out.println(Func(array));
    }

    public static int Func(int[] a) {
        int len = a.length;
        for (int i = 0, j = len-1; i < j; ++i, --j) {
            if (a[i] == i) {
                return i;
            } else if (a[j] == j) {
                return j;
            }
            if (a[i] > i)
                i = a[i];
            if (a[j] < j)
                j = a[j];
        }
        return -1;
    }
}