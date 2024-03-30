package RadixSort;

import java.io.*;
import java.util.*;

public class Algorithm {
    Deque<Integer> dataSet;
    LinkedList<Integer>[] radixes = new LinkedList[10];
    int countOfIterations;

    Algorithm(File file) throws FileNotFoundException {
        this.dataSet = reading(file);
        this.countOfIterations = 0;
        for (int i = 0; i < 10; i++) {
            radixes[i] = new LinkedList<>();
        }
    }

    public long sorting() {
        long startTime = System.nanoTime();
        int max = Collections.max(dataSet);
        int a = 1;
        while (a <= max) {
            while (!dataSet.isEmpty()) {
                Integer data = dataSet.pop();
                radixes[(data % (a * 10)) / a].add(data);
                countOfIterations++;
            }
            for (int i = 0; i < 10; i++) {
                dataSet.addAll(radixes[i]);
                radixes[i].clear();
            }
            a *= 10;
            countOfIterations ++;
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    public void setInFile(int i) throws IOException {
        File file = new File("src\\RadixSort\\dataset" + i + ".txt");
        if (!file.createNewFile()) throw new IOException();
        try {
            FileWriter writer = new FileWriter(file);
            for (Integer data : dataSet) {
                writer.write(data + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Не удалось заполнить файл");
        }
    }

    private LinkedList<Integer> reading(File file) throws FileNotFoundException {
        LinkedList<Integer> datas = new LinkedList<>();
        Scanner s = new Scanner(file);
        while (s.hasNextInt()){
            datas.add(s.nextInt());
        }
        s.close();
        return datas;
    }
}