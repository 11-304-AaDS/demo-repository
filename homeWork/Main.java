package ru.itis.inf304.homeWork;
public class Main {
    public static void main(String[] args) {
        int[] test1 = new int[]{11,23,37,43,53,71,98}; // нет таких i
        int[] test3 = new int[]{-34,-8,1,3,55,98}; // одно i
        System.out.println(find(test1));
        System.out.println(find(test3));
    }
    public static Integer find(int[] arr){
        int n = arr.length;
        Integer findIndex = null;
        if (arr[0] > n){
            System.out.println("таких нет");
            return findIndex;
        }
        int left = 0;
        int right = n-1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] > mid){
                right = mid - 1;
            } else if (arr[mid] < mid) {
                left = mid + 1;
            } else if (arr[mid] == mid){
                findIndex = mid;
                break;
            }
        }
        return findIndex;
    }
}
