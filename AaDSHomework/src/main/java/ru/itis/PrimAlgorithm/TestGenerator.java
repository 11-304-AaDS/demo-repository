package ru.itis.PrimAlgorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestGenerator {

    public static void testGenerate(int countVertexes, int countTest) throws IOException {
        File testFile = new File("testFile.txt");
        testFile.createNewFile();

        try {
            FileWriter writer = new FileWriter("testFile.txt");
            for (int i = 0; i < countTest; i++) {

                /*
                запись одного графа будет в файле в виде 4 строк:
                1) количество вершин
                2) вершина первая у ребра (здесь их будет множество)
                3) вершина вторая у ребра (здесь их будет множество)
                4) вес ребра (здесь из будет множество)
                то есть одно ребро будет считываться с элементов из столбца, а не из строки
                 */

                /*
                создадим массив первой строки (первые вершины ребер)
                массив второй строки (вторые вершины ребер)
                массив третьей строки (вес ребер)

                Иными словами создаем массивы на вывод в файл
                */
                List<Integer> firstVertexes = new ArrayList<>();
                List<Integer> secondVertexes = new ArrayList<>();
                List<Integer> weights = new ArrayList<>();

                // максимальное число ребер
                int maxCountEdges = countVertexes * (countVertexes - 1) / 2;
                int minCountEdges = countTest - 1;

                // рассчитаем количество ребер, созданных одним тестом
                int countEdges = (int) (Math.random() * ((maxCountEdges - minCountEdges) + 1)) + minCountEdges;

                // создадим массив пар вершин, чтобы проверять, не создает ли рандом ребро, вершины которых уже были созданы до этого
                List<VertexPair> edges = new ArrayList<>(countEdges);

                for (int j = 0; j < countEdges; j++) {
                    int v1 = (int) (Math.random() * (countVertexes) + 1);
                    int v2 = (int) (Math.random() * (countVertexes) + 1);

                    // петли не рассматриваем
                    if (v1 == v2) {
                        j--; // это для того, чтоб цикл просто так не пропускал создание ребра, а пробовал заново
                        continue;
                    }

                    VertexPair newPair = new VertexPair(v1, v2);
                    if (edges.contains(newPair)) { // если есть, возврат цикла и по новой
                        j--;
                        continue;
                    }

                    // если нет, то добавляем эту пару, добавляем в массивы на вывод наши созданные вершины и вес
                    edges.add(newPair);
                    firstVertexes.add(v1);
                    secondVertexes.add(v2);
                    weights.add((int) (Math.random() * 100 + 1)); // создание вес аот 1 до 100
                }

                // проверим итоговый граф на работу с алгоритмом Прима (существует вероятность создания несвязного графа)

                Set<Integer> vertexes = new HashSet<>();
                vertexes.addAll(firstVertexes);
                vertexes.addAll(secondVertexes);

                // Если количество использованных вершин в ребрах меньше общего количества ребер, то граф не связный
                // Тогда пересоздаем граф заново
                if (vertexes.size() != countVertexes) {
                    i--;
                    continue;
                }

                writer.write(countVertexes + "\n");
                for (Integer firstVertex : firstVertexes) writer.write(firstVertex + " ");
                writer.write("\n");
                for (Integer secondVertex : secondVertexes) writer.write(secondVertex + " ");
                writer.write("\n");
                for (Integer weight : weights) writer.write(weight + " ");
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

// класс Пара вершин
class VertexPair {
    private final int v1;
    private final int v2;

    VertexPair(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VertexPair)) return false;
        VertexPair that = (VertexPair) o;
        return v1 == that.v1 && v2 == that.v2 || v1 == that.v2 && v2 == that.v1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }
}