package Lesson10;

public class TheSameElementAndIndex {
    public static void main(String[] args) {
        int[] a = {-8, -5, 0, 2, 4, 5, 6};
        System.out.println(search(a, 0, a.length - 1));
    }
    public static int search(int[] a, int top, int end) {
        int middleIndex = (top + end) / 2;
        if (a[middleIndex] == middleIndex) return middleIndex;
        if (top == end) return -1;
        //последующий код работает для массивов, где элементы не повторяются
        //(уточнила, потому что не помню, было ли это в условии задачи)
        if (a[middleIndex] > middleIndex)  return search(a, top, middleIndex);
        if (a[middleIndex] < middleIndex) return search(a, middleIndex + 1, end);
        return -1;
    }
}
