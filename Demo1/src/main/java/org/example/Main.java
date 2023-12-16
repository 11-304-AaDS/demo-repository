package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Client client1 = new Client("Timur", Gender.Male, Discount.Student);
        Client client2 = new Client("Liliana", Gender.Female, Discount.Female);
        Client client3 = new Client("Kamil", Gender.Male);

        Cook cook1 = new Cook("Fedor");
        Cook cook2 = new Cook("Max");

        Order order1 = new Order(client1,cook1,Pizza.Диабло,"13:12",
                list.next(), OrderStatus.Готов);

        //System.out.println(order1);

        for (int i = 0; i < 15; i++) {
            System.out.println(list.next());
        }

    }
}
