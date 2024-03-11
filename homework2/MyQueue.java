package homework2;

import java.util.Stack;

public class MyQueue implements IMyQueue{
    Stack<Integer> s1;
    Stack<Integer> s2;


    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //возвращает с удалением элемент из начала очереди
    @Override
    public Integer pop() {
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    @Override
    public void push(Integer e) {
        s1.push(e);
    }

    @Override
    public boolean isEmpty() {
        if(!s2.isEmpty()){
            return false;
        }
        return s1.isEmpty();
    }

    //возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
    @Override
    public Integer peek() {
        if(!s2.isEmpty()) {
            return s2.peek();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

}
