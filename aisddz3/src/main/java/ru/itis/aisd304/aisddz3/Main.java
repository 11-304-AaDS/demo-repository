package ru.itis.aisd304.aisddz3;

public class Main {

    public static int findIndex(int[] arr) {
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

    public static void main(String[] args) {
        int[] arr1 = {-5, -3, 2, 4, 6, 8, 90};
        int[] arr2 = {-57, -48, 0, 1, 43, 64};

        if (findIndex(arr1) != -1) {
            System.out.println("Индекс, совпавший со своим элементом: " + findIndex(arr1));
        } else {
            System.out.println("Такого индекса нет");
        }

        if (findIndex(arr2) != -1) {
            System.out.println("Индекс, совпавший со своим элементом: " + findIndex(arr2));
        } else {
            System.out.println("Такого индекса нет");
        }
    }
}