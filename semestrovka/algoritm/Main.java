package semestrovka.algoritm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> listVer = new ArrayList<>();
        List<int[][]> listDug = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\AISD\\src\\main\\java\\semestrovka\\createАrcs\\graph1.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(":")) {
                Matcher m = Pattern.compile("\\d+").matcher(line);
                while (m.find()) {
                    listVer.add(Integer.valueOf(m.group(0)));
                }
            } else {
                String[] a = line.split(";");
                String[][] c = new String[a.length][2];
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i].split(" ");
                }
                int[][] fromStringToInt = new int[a.length][2];
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c[i].length; j++) {
                        fromStringToInt[i][j] = Integer.parseInt(c[i][j]);
                    }
                }
                listDug.add(fromStringToInt);
            }
        }
        reader.close();



        for (int i = 0; i <listVer.size(); i++) {
            Graph graph = new Graph();
            double start = System.nanoTime();
            graph.TopologicalSort(listVer.get(i), listDug.get(i));
            double finish = System.nanoTime();
            double res = (finish-start) / 1000000;
            //System.out.println(listVer.get(i));
            //System.out.println(res);
            System.out.println(graph.count);
        }




















        /*
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Java\\AISD\\src\\main\\java\\semestrovka\\createАrcs\\graph.txt"));
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


        //System.out.println(Arrays.toString(graph.Finish(n, mas)));
    }


         */

    }
}
