package semestrovka.algoritm;

import java.util.*;

public class Graph {
    public int count = 0;
    // входные данные - количество вершин и дуги. пример: [1,4] - дуга из вершины 4 в 1
    public int[] TopologicalSort (int numАrcs, int[][] road) {

        //создаём таблицу, в которой будем рассчитывать степень вхождения каждой вершины графа.
        //каждый индекс в массиве = номер вершины
        int[] table = new int[numАrcs];
        for (int[] vertic : road) {
            int curVertic = vertic[0];
            table[curVertic]++;
            count++;
        }
        //объявление массива table и заполнение данными происходит за O(V),
        // где V - кол-во вершин


        //создаём очередь, в которую будем добавлять вершины, у которых степень входящих рёбер равна нулю.
        Set<Integer> hs = new HashSet<>();
        //ищем вершины, в которые нет входа
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 0) {
                hs.add(i);
                count++;
            }
        }
        //обход каждой вершины за O(V), где V - количество вершин


        //если очередь пустая, то граф содержит цикл -> сортировка не сработает
        if (hs.isEmpty()) {
            return new int[] {};
        }
        //проверка наличия цикла - за O(1)


        int[] res = new int[numАrcs];
        int index = 0;
        //пока очередь вершин не пустая
        while (!hs.isEmpty()) {
            Iterator<Integer> iterator = hs.iterator();
            Integer Ver = iterator.next(); //вершина, в которые нет входа - Ver
            //удаляем рёбра, которые исходят от element
            for (int i = 0; i < road.length; i++) {
                if (Ver == road[i][1]) {
                    //вычитаем из таблицы одну единицу у вершины, в которую входил element
                    int curVertex = road[i][0];
                    table[curVertex]--;
                    count++;
                    //если количество входов в вершину в таблице стала равна нулю, то мы
                    //добавляем её в очередь
                    if (table[curVertex] == 0) {
                        hs.add(curVertex);
                        count++;
                    }
                }
            }
            //добавляем в конечную последовательность вершину Ver
            res[index++] = Ver;
            //удаляем элемент с сета, потому что он остался пустым
            hs.remove(Ver);
        }
        //oбход каждого ребра в графе, поиск и обработка вершин, входящих в каждое ребро
        //за O(N), где N - количество рёбер


        //проверка на цикл
        for (int course : table) {
            if (course > 0) return new int[] {};
        }
        return res;
        //проверка наличия цикла путем обхода всех вершин - O(V)

        //итого: O(V + V + 1 + N + N + V) = O(3V + 2N + 1) = O(V + N) - временная сложность
        //сложность по памяти: O(V) - место для очереди
    }
}
