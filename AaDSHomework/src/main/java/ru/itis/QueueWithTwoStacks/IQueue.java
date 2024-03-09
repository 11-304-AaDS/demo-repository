package ru.itis.QueueWithTwoStacks;

public interface IQueue<T> {
    void push(T e); // добавляет элемент в конец очереди
    T pop(); // возвращает, удаляет первый элемент из очереди
    boolean isEmpty(); // проверяет есть ли элементы в очереди
    T peek(); // возвращает элемент в начале очереди, но не удаляет его в отличие от POP
}