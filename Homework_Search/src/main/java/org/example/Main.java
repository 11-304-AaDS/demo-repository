package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 23, 45, 99, 104};
        Scanner in = new Scanner(System.in);
        try {
            int x = input();
            System.out.println("Ближайшее меньшее число: " + search(arr, x));
        } catch (InvalidNumber | NonExistentNumber e) {
            System.out.println(e.getMessage());
        }

    }

    private static int search(int[] arr, int findValue) throws InvalidNumber, NonExistentNumber {
        if (findValue < 0) throw new InvalidNumber("A negative number");
        if (findValue <= arr[0]) throw new NonExistentNumber("A non-existent number");
        int result = -1;
        if (findValue > arr[arr.length-1]) return arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(findValue <= arr[i+1]) {
                result = arr[i];
                break;
            }
        }
        return result;
    }

    private static int input() {
        String str;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean flag = false;
        while(!flag){
            try {
                str = sc.nextLine();
                n = Integer.parseInt(str);
                flag = true;
            } catch(NumberFormatException e) {
                System.out.println("It`s not number");
            }
        }
        return n;
    }
}