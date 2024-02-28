package Lesson03;

 public class Queue{
    //реализовать очередь через массив в виде класса
    //должно быть два файла, в одном будет очередь, во втором будет мэйн
    //в мэйне сделать так, чтобы что-то лежало, начальные данные
    //push, pop, isEmpty, peek(выдает первое)
    //в мэйне должны работать все методы
    //загрузить в гит

    public int[] array;
    int size;
    int top;
    int end;

    Queue(int n) {
        this.array = new int[n];
        this.size = 0;
        this.top = 0;
        this.end = 0;
    }

    //добавляет элемент в конец очереди
    public void push(int e) throws Exception {
        if (size == array.length) throw new Exception();
        array[end] = e;
        size++;
        //указывает на, следующую после заполненной, ячейку
        end = (top + size) % array.length;
    }

    //удаляет первый элемент в очереди
    public void pop() throws Exception{
        if (isEmpty()) throw new Exception();
        array[top] = 0;
        top++;
        size--;
        if (top == array.length) {
            top = end - 1;
            end = 0;
        }
    }

    //проверяет очередь на пустоту
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    //показывает какое значение будет удалено при pop
    public int peek() {
        return array[top];
    }
}
