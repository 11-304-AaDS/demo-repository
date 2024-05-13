package AVLTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> set = new ArrayList<>();
        Random generator = new Random();
        while (set.size() < 10000) {
            int a = generator.nextInt(100000);
            if (!set.contains(a)) set.add(a);
        }

        long timeOfAdding = 0;
        long timeOfFinding = 0;
        long timeOfDeleting = 0;

        //добавляем файлы в лист (для проверки на повторение) и в дерево
        int b = generator.nextInt(100000);
        Node root = new Node(b);
        AVLTree tree = new AVLTree(root);

        for (int i = 0; i < 10000; i++) {
            long start = System.nanoTime();
            tree.insert(tree.root, set.get(i));
            long stop = System.nanoTime();
            timeOfAdding += stop - start;
        }

        for(int i = 0; i < 100; i++) {
            int a = generator.nextInt(100000);
            long start = System.nanoTime();
            tree.find(tree.root, a);
            long stop = System.nanoTime();
            timeOfFinding += stop - start;
        }

        for (int i = 0; i < 1000; i++) {
            int a = generator.nextInt(10000);
            long start = System.nanoTime();
            tree.delete(tree.root, a);
            long stop = System.nanoTime();
            timeOfDeleting += stop - start;
        }

        System.out.println("Среднее время добавления элемента: " + timeOfAdding / (long)10000 + " наносекунды");

        System.out.println("Среднее количество оперций при добавлении элемента: " + tree.countOfAddingOperations / 10000 + " операций");

        System.out.println("Среднее время поиска элемента: " + timeOfFinding / (long)10000 + " наносекунды");

        System.out.println("Среднее количество оперций при поиске элемента: " + tree.countOfFindingOperations / 100 + " операций");

        System.out.println("Среднее время удаления элемента: " + timeOfDeleting / (long)10000 + " наносекунды");

        System.out.println("Среднее количество оперций при удалении элемента: " + tree.countOfDeletingOperations / 1000 + " операций");

    }
}
