package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestGenerator {

    public static void testGenerate(int size, int countTest) throws IOException {
        File myFile = new File("myFile.txt");
        myFile.createNewFile();

        try {
            FileWriter writer = new FileWriter("myFile.txt");
            for (int i = 0; i < countTest; i++) {
                int[] array = new int[size];
                for (int j = 0; j < size; j++) {
                    array[j] = (int) (Math.random() * size);
                    writer.write(array[j] + " ");
                }
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
