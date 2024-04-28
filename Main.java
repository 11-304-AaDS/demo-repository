package hw;

public class Main {

    public static void main(String[] args) {
        int[] array = {100, 12, 4, 3, 14, 0, 7, 20};
        int x = findElem(array);

        if ( x!=-1 ) {
            System.out.println("Найден элемент " + x);
        } else {
            System.out.println("Подобный элемент отсутсвует");
        }
    }

    public static int findElem(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while ( left<=right ) {
            int middle = (left + right)/2;

            if ( a[middle]==middle ) { return middle; }
            else if ( a[middle]<middle ) { left = middle+1; }
            else { right = middle-1; }
        }
        return -1;
    }
}