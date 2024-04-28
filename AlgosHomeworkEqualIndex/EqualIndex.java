package AlgosHomeworkEqualIndex;

public class EqualIndex {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{-2, 0, 2, 3, 6, 8, 10};
        System.out.println(FindEqualIndex(array));
    }

    public static Integer FindEqualIndex(Integer[] test) {
        int left = 0;
        int  right = test.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (test[mid] == mid) {
                return mid;
            }
            if (test[mid] < mid) {
                left = mid + 1;
            } else if (test[mid] > mid) {
                right = mid - 1;
            }
        }
        return -1;
    }
}

