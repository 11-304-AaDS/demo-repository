package Homework3;
public class BinaryS {
    public static int bs(int[] a, int l, int r){
        if(r<l){
            return -1; //число не найдено
        }
        int step = (l+r)/2;
        if(a[step] > step) return bs(a, l, step-1);
        else if (a[step] < step) return bs(a, step + 1, r);
        else return step;
    }

    public static void main(String[] args) {
        int[] a = {-8, -6, -4, -1, 0, 2, 4, 6, 7, 9, 12, 24, 56}; //9
        int[] a0 = {-8, -6, 2, 4, 6, 7, 8, 12, 24, 56};  //2
        int[] a1 = {-8, -6, -4, -1, 0, 2, 6, 7, 8, 12, 24, 56}; //6
        int[] a2 = {0, 2, 4, 6, 7, 8, 12, 24, 56}; //0
        int[] a3 = {-8, -6, -4, -1, 0, 2, 4, 6, 7, 8, 9, 10, 12}; //12
        int[] a4 = {-8, -6, -4, -1, 0, 2, 4, 6, 7, 8, 9, 10, 13}; //-1
        System.out.println(bs(a, 0, a.length-1));
        System.out.println(bs(a0, 0, a0.length-1));
        System.out.println(bs(a1, 0, a1.length-1));
        System.out.println(bs(a2, 0, a2.length-1));
        System.out.println(bs(a3, 0, a3.length-1));
        System.out.println(bs(a4, 0, a4.length-1));
    }
}
