package homework1;
//Queue - очередь

public interface IQueue {
    public void push(Object e);//вставляем элемент в конец очереди
    public Object pop();//возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
    public boolean isEmpty();//
    public Object peek();//возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

}
