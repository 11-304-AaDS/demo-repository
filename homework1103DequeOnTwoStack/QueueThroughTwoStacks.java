package homework1103DequeOnTwoStack;

import java.util.Stack;

// очередь через два стека
// pop push empty peek o(1) class

public class QueueThroughTwoStacks<T>{
    private Stack<T>  addingStack;
    private Stack<T> poppingStack;
    public QueueThroughTwoStacks() {
        addingStack = new Stack<>();
        poppingStack = new Stack<>();
    }
    public T pop(){
        if (!poppingStack.isEmpty()) return poppingStack.pop();
        dataTransfer();
        return poppingStack.pop();
    }
    public void push(T element){
        addingStack.push(element);
    }
    public boolean isEmpty(){
        return (addingStack.isEmpty() && poppingStack.isEmpty());
    }

    public T peek(){
        if (poppingStack.isEmpty()) dataTransfer();
        return poppingStack.peek();
    }
    private void dataTransfer(){
        while (!addingStack.isEmpty()){
            poppingStack.push(addingStack.pop());
        }
    }

    @Override
    public String toString() {
        return "QueueThroughTwoStacks{" +
                "addingStack=" + addingStack +
                ", poppingStack=" + poppingStack +
                '}';
    }
}
