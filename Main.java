package les8;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,3,4,4,6,7};
        int[] arr2 = {4,6,7,9,14};
        int res1 = findI(arr1);
        int res2 = findI(arr2);
        System.out.println("первый массив: " + res1 + " второй массив: " + res2);
    }

    public static int findI(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == m) {
                return m;
            } else if (arr[m] > m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
