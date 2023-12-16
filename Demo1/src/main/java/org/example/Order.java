package org.example;

public class Order {
    private Client client;
    private Cook cook;
    private Pizza pizza;
    private String time;
    private Integer orderNumber;
    private OrderStatus orderStatus;
    public Order(Client client, Cook cook, Pizza pizza, String time, Integer orderNumber, OrderStatus orderStatus) {
        this.client = client;
        this.cook = cook;
        this.pizza = pizza;
        this.time = time;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

}
