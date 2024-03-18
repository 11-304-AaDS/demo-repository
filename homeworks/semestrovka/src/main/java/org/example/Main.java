package org.example;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        File myFile = new File("myFile.txt");
        myFile.createNewFile();

        try {
            FileWriter writer = new FileWriter("myFile.txt");
            for (int i = 0; i < 10; i++) {
                int[] array = new int[100];
                for (int j = 0; j < 100; j++) {
                    array[j] = (int) (Math.random() * 100);
                    writer.write(array[j] + " ");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

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

                float start = System.nanoTime();
                StoogSort.sort(array, 0, array.length-1);
                float end = System.nanoTime();

                System.out.println(end + " " + start);

                System.out.println(Arrays.toString(array));
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}