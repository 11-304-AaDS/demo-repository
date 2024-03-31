package semestrovka.createАrcs;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) throws IOException {
        File file = new File("graph1.txt");
        FileWriter writer = new FileWriter(file);
        Random random = new Random();
        for (int i = 0; i < 60; i++) {
            int n = (int) (100 + Math.random()* 9900);
            int[][] mas = new int[n][2];
            writer.write("кол-во вершин:" + n);
            writer.append("\n");
            for (int j = 0; j < n; j++) {
                int from = random.nextInt(n); //вершина, от которой будет исходить дуга
                int to = random.nextInt(n); //вершина, в которую входит дуга
                //если вершина, в которую входят и выходят это одна вершина, а также если
                //дуга из from в to приведёт к циклу, то to и from сгенерируется на другое число
                while (isConnected(mas, from,to) || to == from) {
                    to =  random.nextInt(n);
                    from =  random.nextInt(n);
                }
                //если всё в порядке, то числа добавляются в массив
                mas[j][0] = to;
                mas[j][1] = from;
                String number = mas[j][0] + " " + mas[j][1] + ";";
                writer.write(number);
            }
            writer.append("\n");
        }

    }
    public static boolean isConnected(int[][] mas, int from, int to) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][1] == to | mas[i][0] == from) {
                return true;
            }
        }
        return false;
    }
}
