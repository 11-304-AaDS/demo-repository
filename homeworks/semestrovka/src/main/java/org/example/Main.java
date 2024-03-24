package org.example;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        TestGenerator.testGenerate();

        try {
            FileReader fr = new FileReader("myFile.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] str = line.split(" ");
                int[] array = new int[str.length];
                for (int i = 0; i < str.length; i++) {
                    array[i] = Integer.parseInt(str[i]);
                }

                //
                double start = System.currentTimeMillis();
                StoogSort.sort(array, 0, array.length-1);
                //int k = StoogeSortWithCountOperations.sort(array, 0, array.length-1);
                double end = System.currentTimeMillis();
                //

                System.out.println(str.length + ": " + (end-start)  + " миллисекунд");

                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}