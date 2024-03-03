package ru.itis.inf304.lab4;

public interface Iqueue<T> {
   void push(T e);
   T peek();
   T pop();
   boolean isEmpty();
   int getSize();
   T gettop();
   T getend();
}
