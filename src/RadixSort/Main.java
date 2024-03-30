package RadixSort;

import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        int count = 100;

        long[] time = new long[count];
        int [] amountOfElements = new int[count];
        int[] amountOfIterations = new int[count];

        for(int i = 1; i < count + 1; i++) {
            Generator generator = new Generator();
            File file = generator.createFile(i);
            Algorithm radixSort = new Algorithm(file);
            amountOfElements[i-1] = radixSort.dataSet.size();
            long timeOfAlgorithm = radixSort.sorting()/(long) 1000000;
            amountOfIterations[i-1] = radixSort.countOfIterations;
            file.delete();
            radixSort.setInFile(i);
            time[i-1] = timeOfAlgorithm;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(time[i] + ";");
            System.out.print(amountOfElements[i] + ";");
            System.out.print(amountOfIterations[i]);
            System.out.println();
        }
    }
}
