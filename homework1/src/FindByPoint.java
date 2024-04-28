public class FindByPoint {


    public static void main(String[] args) {
        int[] array_1 = {-3, -1, 0, 3, 5, 7, 8, 10};
        int[] array_2 = {-10, -5, 0, 1, 2, 4, 12};
        if (findByPoint(array_1) != -1) {
            System.out.println("Index: " + findByPoint(array_1));
        } else {
            System.out.println("Index not found");
        }

        if (findByPoint(array_2) != -1) {
            System.out.println("Index: " + findByPoint(array_2));
        } else {
            System.out.println("Index not found");
        }
    }

    public static int findByPoint(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == mid) {
                return mid;
            } else if (array[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
