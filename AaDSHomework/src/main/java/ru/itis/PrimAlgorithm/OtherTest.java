package ru.itis.PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class OtherTest {
    public static void main(String[] args) {

        // пример неработающего графа
        List<Integer> vertexes = new ArrayList<>(10);
        List<Edge> edges = new ArrayList<>();
        for (int i = 1; i <= 10; i++) vertexes.add(i);
        edges.add(new Edge(5, 3, 47));
        edges.add(new Edge(2, 10, 33));
        edges.add(new Edge(4, 1, 23));
        edges.add(new Edge(6, 10, 12));
        edges.add(new Edge(1, 6, 96));
        edges.add(new Edge(9, 2, 20));
        edges.add(new Edge(9, 5, 33));
        edges.add(new Edge(1, 7, 85));
        edges.add(new Edge(9, 4, 42));
        edges.add(new Edge(2, 1, 93));
        edges.add(new Edge(6, 2, 16));
        edges.add(new Edge(5, 7, 9));
        edges.add(new Edge(3, 10, 11));
        new Graph(vertexes, edges).primAlgorithm().print();
        // он не создает вершину 8 в ребрах
    }
}
