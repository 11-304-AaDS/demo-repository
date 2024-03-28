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
                //дуга из from в to приведёт к циклу, то to сгенерируется на другое число
                while (to == j || isConnected(mas, from,to) || to == from) {
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
/*
        BufferedReader reader = new BufferedReader(new FileReader("graph.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(":")) {
                System.out.println(line);
            } else {
                String[] a = line.split(";");
                String[][] c = new String[a.length][2];
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i].split(" ");
                }
                System.out.println(Arrays.deepToString(c));
            }
        }
        reader.close();


 */

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
