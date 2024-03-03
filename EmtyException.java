package les3.QueueDz;

public class EmtyException extends Exception{
    public EmtyException(){
        super("из очереди нельзя ничего удалить, так как в нём нет элементов");
    }
}
