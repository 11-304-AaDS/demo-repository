package ru.itis.PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;

// класс графа
public class Graph {
    private final List<Integer> vertexes; // множество вершин
    private final List<Edge> edges; // множество ребер
    private int generalWeight; // общий вес графа

    Graph(List<Integer> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
        for (Edge i : edges) generalWeight += i.weight;
    }

    // что попробовать изменить: заменить массивы, в которых только удаляем, на LinkedList;
    // заменить примитивы в ребрах на Integer.

    PrimResult primAlgorithm() throws IndexOutOfBoundsException {

        // начнем замерять время и добавим счетчик итераций цикла
        long before = System.currentTimeMillis();
        long counterIterations = 0;

        // минимальный остов
        List<Edge> minOstovEdges = new ArrayList<>();

        //неиспользованные ребра
        List<Edge> edgesNotUsed = new ArrayList<>();
        for (Edge e : edges) {
            edgesNotUsed.add(new Edge(e.v1, e.v2, e.weight));
            counterIterations++;
        }

        //использованные вершины
        List<Integer> vertexesUsed = new ArrayList<>();

        //неиспользованные вершины
        List<Integer> vertexesNotUsed = new ArrayList<>();
        for (int i = 1; i <= vertexes.size(); i++, counterIterations++)
            vertexesNotUsed.add(i);

        //выберем первую вершину как начальную
        vertexesUsed.add(1);
        vertexesNotUsed.remove((Integer) 1);

        // сам алгоритм
        while (!vertexesNotUsed.isEmpty())
        {
            int minE = -1; //номер наименьшего ребра

            //поиск наименьшего ребра
            for (int i = 0; i < edgesNotUsed.size(); i++, counterIterations++)
            {

                // проверка, что одна из вершин ребра уже использована, а другая нет
                if ((vertexesUsed.contains(edgesNotUsed.get(i).v1)) && (!vertexesUsed.contains(edgesNotUsed.get(i).v2)) ||
                        (vertexesUsed.contains(edgesNotUsed.get(i).v2)) && (!vertexesUsed.contains(edgesNotUsed.get(i).v1)))
                {
                    if (minE != -1)
                    {
                        if (edgesNotUsed.get(i).weight < edgesNotUsed.get(minE).weight)
                            minE = i;
                    }
                    else
                        minE = i;
                }
            }

            //заносим новую вершину в список использованных и удаляем ее из списка неиспользованных
            if (vertexesUsed.contains(edgesNotUsed.get(minE).v1))
            {
                vertexesUsed.add(edgesNotUsed.get(minE).v2);
                vertexesNotUsed.remove((Integer) edgesNotUsed.get(minE).v2);
            }
            else
            {
                vertexesUsed.add(edgesNotUsed.get(minE).v1);
                vertexesNotUsed.remove((Integer) edgesNotUsed.get(minE).v1);
            }

            //заносим новое ребро в дерево и удаляем его из списка неиспользованных
            minOstovEdges.add(edgesNotUsed.get(minE));
            edgesNotUsed.remove(minE);
        }

        // закончим подсчет времени
        long after = System.currentTimeMillis();

        return new PrimResult(new Graph(vertexesUsed, minOstovEdges), vertexes.size(), edges.size(), after - before, counterIterations);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexes=" + vertexes +
                ", edges=" + edges +
                ", generalWeight=" + generalWeight +
                '}';
    }
}