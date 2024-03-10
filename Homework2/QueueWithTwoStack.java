package Homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class QueueWithTwoStack<T> {
    private Deque<T> stackPush = new LinkedList<>();
    private Deque<T> stackPop = new LinkedList<>();
    private int size = 0;


    public void push(T i){
        stackPush.push(i);
        size++;
    }

    public T pop(){
        if (stackPop.isEmpty()){
            for (int i = 0; i < size; i++) {
                stackPop.push(stackPush.pop());
            }
        }
        size--;
        return stackPop.pop();
    }
    public boolean isEmpty(){
        return size==0;
    }
    public T peek(){
        if (stackPop.isEmpty()){
            for (int i = 0; i < stackPush.size(); i++) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public String toString() {
        Object[] queue = new Object[size];

        if(!stackPop.isEmpty()){
            Object[] stackPopArray = stackPop.toArray();
            for (int i = 0; i < stackPopArray.length; i++) {
                queue[i]  = stackPopArray[i];
            }
        }
        if(!stackPush.isEmpty()){
            Object[] stackPushArray = stackPush.toArray();
            for (int i = stackPushArray.length-1; i >= 0; i--) {
                queue[(size-1) - i]  = stackPushArray[i];
            }
        }
//        System.out.println("StackPush: " + stackPush);
//        System.out.println("StackPop: " + stackPop);
        return Arrays.toString(queue);
    }
}
