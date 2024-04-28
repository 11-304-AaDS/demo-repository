package ru.itis;

public class Homework {
    public static void main(String[] args) {
        int[] mass = {12, 14, 15, 16, 17, 18, 20};
        int[] mass1 = {1, 2, 3, 3, 17, 18, 20};
        System.out.println("result mass[]: " + findIndex(mass) + ", result mass1[]: " + findIndex(mass1));
    }

    public static int findIndex(int[] mass) {

        int l = 0;
        int r = mass.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mass[mid] == mid) {
                return mid;
            } else if (mass[mid] > mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}
