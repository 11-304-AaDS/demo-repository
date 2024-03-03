package les3.QueueDz;

public class FullException extends Exception{
    public FullException(){
        super("в очередь нельзя добавить новый элемент, так как он уже переполнен");
    }
}
