package org.example;

class Main {
    private static int countIter = 0;
//    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 5, 6, 7, 17, 18, 9};
        System.out.println(findElem(nums, 0, nums.length - 1));
        System.out.println(countIter);

    }

    public static int findElem(int[] nums, int l, int r) {
        countIter++;
        if (l > r) {
            return -1;
        }
        if (nums[(l + r) / 2] == (l + r) / 2) {
            return (l + r) / 2;
        } else if (nums[(l + r) / 2] < (l + r) / 2) {
            return findElem(nums, (l + r) / 2 + 1, r);
        } else {
            return findElem(nums, l, (l + r) / 2 - 1);
        }
    }
}