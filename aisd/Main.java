package itis.aisd;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Btree bTree = new Btree(100);

        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        long startTime;
        long endTime;

        long searchTime = 0;
        int searchCount = 0;
        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(arr.length);
            startTime = System.nanoTime();
            BtreeNode s = bTree.search(arr[index]);
            endTime = System.nanoTime();
            long endSearchTime = endTime - startTime;
            searchTime += endSearchTime;
            searchCount++;
        }
        double averageSearchTime = (double) searchTime / searchCount;
        System.out.println("cреднее время поиска: " + averageSearchTime);

        long insertionTime = 0;
        int insertionCount = 0;
        for (int i = 0; i < arr.length; i++) {
            startTime = System.nanoTime();
            bTree.insert(arr[i]);
            endTime = System.nanoTime();
            long endInsertTime = endTime - startTime;
            insertionTime += endInsertTime;
            insertionCount++;
        }
        double averageInsertion = (double) insertionTime / insertionCount;
        System.out.println("cреднее время дообавления: " + averageInsertion );

        long removeTime = 0;
        int removeCount = 0;
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(arr.length);
            startTime = System.nanoTime();
            bTree.Remove(arr[index]);
            endTime = System.nanoTime();
            long endRemoveTime = endTime - startTime;
            removeTime += endRemoveTime;
            removeCount++;
        }
        double averageRemoveTime = (double) removeTime / removeCount;
        System.out.println("cреднее время удаления: " + averageRemoveTime);



    }
}
