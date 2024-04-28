import java.util.LinkedList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of( -120, -109, -97, -84, -67, -56, -45, -39, -33, -25, -10, -8, 5, 17, 39, 64, 76, 92, 98, 123));
        System.out.println(binarySearch(list, 5));
    }

    public static int binarySearch(List<Integer> list, Integer element) {
        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            if (element.compareTo(list.get(middle)) > 0) {
                left = middle + 1;
            } else if (element.compareTo(list.get(middle)) < 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
