package org.example;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        TestGenerator.testGenerate(100, 10);

        double srznach = 0;
        //double maxTime = -100000;
        //double minTime =  100000;

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
                double end = System.currentTimeMillis();
                //

                System.out.println(((end - start) ) + " секунд");
                //srznach += end-start;
                //minTime = Math.min(minTime, (end - start) );
                //maxTime = Math.max(maxTime, (end - start) );

                //System.out.println(Arrays.toString(array));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //System.out.println(srznach / 100);
    }
}