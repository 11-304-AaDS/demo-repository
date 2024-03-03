package queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<String> test = new ArrayQueue<>(2);
        test.push("Test1");
        test.push("test2");
        test.pop();
        test.push("Test 4");
        test.toStrinf();
    }
}
