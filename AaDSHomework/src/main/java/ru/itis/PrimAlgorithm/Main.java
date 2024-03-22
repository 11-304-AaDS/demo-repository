package ru.itis.PrimAlgorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int countVertexes = 100;
        int countTest = 10;
        TestGenerator.testGenerate(countVertexes, countTest);
        List<Graph> graphs = new ArrayList<>(countTest);

        try {
            FileReader fr = new FileReader("testFile.txt");
            BufferedReader reader = new BufferedReader(fr);
            for (int i = 0; i < countTest; i++) {
                reader.readLine();

                //создаем данные для графа
                List<Edge> edges = new ArrayList<>();
                List<Integer> vertexes = new ArrayList<>(countVertexes);
                for (int k = 1; k <= countVertexes; k++) vertexes.add(k);

                // создаем ребра
                String[] line1 = reader.readLine().split(" ");
                String[] line2 = reader.readLine().split(" ");
                String[] line3 = reader.readLine().split(" ");

                for (int j = 0; j < line1.length; j++) {
                    edges.add(new Edge(Integer.parseInt(line1[j]), Integer.parseInt(line2[j]), Integer.parseInt(line3[j])));
                }

                graphs.add(new Graph(vertexes, edges));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Graph g : graphs) {
            System.out.println(g);
            g.primAlgorithm().print();
            System.out.println();
        }
    }
}
