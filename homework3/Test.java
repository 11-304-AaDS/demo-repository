package homework3;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7 };
        int result = findIndex(arr);
        System.out.println("Индекс равного элемента: " + result);
    }

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
}
