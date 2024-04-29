package ru.itis.AaDS.DZsem10;

public class DZsem10 {
    public static void main(String[] args) {
        int[] arr = new int[] {-123,-100,0,3,4,92,234,21334};

        System.out.println(indexValue(arr));
    }

    public static int indexValue(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == mid) {
                return mid;
            }

            if (arr[mid] < mid) {
                l = mid + 1;
            }

            if (arr[mid] > mid) {
                r = mid - 1;
            }
        }
        return -1;
    }
}
