package ru.itis.SearchForElementsEqualToIndex;

public class Search {
    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 2, 3, 5, 6, 19};
        int[] array = {-1, 0, 1, 3, 6, 7, 8};
        System.out.println(findElementIndexEqualsValue(arr));
        System.out.println(findElementIndexEqualsValue(array));
    }

    public static int findElementIndexEqualsValue(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
