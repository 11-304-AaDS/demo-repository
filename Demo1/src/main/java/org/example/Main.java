package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // 3 Клиента
        Client[] client = {new Client("Соуп", Gender.Male, Discount.Student),
                new Client("Гоуст", Gender.Female, Discount.Female),
                new Client("Прайс", Gender.Male)};

        // 2 Повара
        Cook[] cook = {new Cook("Огузок"), new Cook("Лёва")};

        // 15 заказов
        Order[] order = new Order[15];

        for (int i = 0; i < 15; i++) {
            order[i] = new Order(getRandomClient(client), getRandomClient(cook),
                    Pizza.generateRandomPizza(), "18:04",
                    i, OrderStatus.generateOrderStatus());
        }

        for (int i = 1; i <= 20; i++) {
            System.out.println(order[list.next()]);
        }

    }

    public static <T> T getRandomClient(Object[] obj) {
        int rnd = new Random().nextInt(obj.length);
        return (T) obj[rnd];
    }
}
