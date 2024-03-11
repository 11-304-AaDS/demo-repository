package homework2;

public interface IMyQueue {
    public Integer pop();//возвращает с удалением элемент из начала очереди
    public void push(Integer e);//вставляем элемент в конец
    public boolean isEmpty();
    public Integer peek();//возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
}
