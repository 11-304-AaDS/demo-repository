package RadixSort;

import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 6;

        for(int i = 1; i < count + 1; i++) {
            Generator generator = new Generator();
            File file = generator.createFile(i);
            Algorithm radixSort = new Algorithm(file);
            radixSort.sorting();
            file.delete();
            for (Integer data : radixSort.dataSet) {
                System.out.println(data);
            }
            radixSort.setInFile(i);
        }
    }
}
