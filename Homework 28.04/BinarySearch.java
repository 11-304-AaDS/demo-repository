import java.util.LinkedList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(-49, -1, 2, 34, 51, 228, 1488, 5000, 6000, 7000));
        System.out.println(binarySearch(list));
    }

    public static int binarySearch(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            Integer middle = (left + right) / 2;
            if (middle.compareTo(list.get(middle)) > 0) {
                left = middle + 1;
            } else if (middle.compareTo(list.get(middle)) < 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
