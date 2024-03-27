package RadixSort;

import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {

        int count = 1;

        long[] time = new long[count];

        for(int i = 1; i < count + 1; i++) {
            long startTime = System.nanoTime();
            Generator generator = new Generator();
            File file = generator.createFile(i);
            Algorithm radixSort = new Algorithm(file);
            radixSort.sorting();
            file.delete();
            radixSort.setInFile(i);
            long finishTime = System.nanoTime();
            time[i-1] = (finishTime - startTime)/(long)1000000;
        }

        for (long t : time) {
            System.out.println(t);
        }
    }
}
