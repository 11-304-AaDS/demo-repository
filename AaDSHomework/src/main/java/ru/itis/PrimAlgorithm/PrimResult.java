package ru.itis.PrimAlgorithm;

public class PrimResult {
    long countVertexes;
    long countEdges;
    long timeUsed;
    long numberOfIterations;

    public PrimResult(long countVertexes, long countEdges, long timeUsed, long numberOfIterations) {
        this.countVertexes = countVertexes;
        this.countEdges = countEdges;
        this.timeUsed = timeUsed;
        this.numberOfIterations = numberOfIterations;
    }

    public void print() {
        System.out.println("Количество вершин: " + countVertexes);
        System.out.println("Количество ребер в изначальном графе: " + countEdges);
        System.out.println("Сколько затрачено времени: " + timeUsed);
        System.out.println("Сколько итераций было совершено: " + numberOfIterations);
    }
}
