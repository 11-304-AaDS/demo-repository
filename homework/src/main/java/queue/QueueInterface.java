package queue;

public interface QueueInterface <T>{
    void push (T element);

    T peek ();

    T pop ();

    boolean isEmpty();

}

/*
peek - возращает первый элемент, но не удаляет из очереди
push - добавляет элемент в конец очереди
pop(pull) - возращает первый элемент, удаляя из очереди
isEmpty - проверяет пуста ли очередь
*/
