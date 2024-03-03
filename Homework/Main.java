package Homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1(5);

    }
    public static void test1(int cap){
        Queue<Integer> a = new Queue<>(cap);
        System.out.println("Очередь пуста? " + a.isEmpty() + "\n");

        System.out.println("Заполненная очередь:");
        for (int i = 0; i < cap; i++) {
            a.push(i);
        }
        System.out.println(a + "\n");

        System.out.println("Удалим первых два элемента:"+"\n" + a.pop() + "\t" + a.pop());
        System.out.println(a +  "\n");

        System.out.println("Посмотрим какой первый:");
        System.out.println(a.peek() + "\n");

        System.out.println("Добавим еще один элемент(5):");
        a.push(5);
        System.out.println(a + "\n");

        System.out.println("Пока очередь не пуста будем удалять элементы и возвращать их значения");
        while (!a.isEmpty()){
            System.out.println(a.pop());
        }
        System.out.println("\n"+ "Очередь пуста? " + a.isEmpty());
        System.out.println(a);


    }

}
