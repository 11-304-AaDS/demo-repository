package org.example;

import java.util.Random;

public enum OrderStatus {
    Заказан, Готов, Выдан;

    public static OrderStatus generateOrderStatus() {
        OrderStatus[] orderStatuses = OrderStatus.values();
        int length = orderStatuses.length;
        int randIndex = new Random().nextInt(length);
        return orderStatuses[randIndex];
    }
}
