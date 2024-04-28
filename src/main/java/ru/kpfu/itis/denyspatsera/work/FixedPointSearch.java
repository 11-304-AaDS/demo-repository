package ru.kpfu.itis.denyspatsera.work;

public class FixedPointSearch {

    public static int findFixedPoint(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == mid) return mid;
            if (arr[mid] < mid) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 3, 7, 9, 20};
        int result = findFixedPoint(arr);
        if (result != -1) {
            System.out.println("Fixed point is at index: " + result);
        } else {
            System.out.println("No fixed point found.");
        }
    }
}
