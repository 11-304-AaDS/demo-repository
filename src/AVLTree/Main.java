package AVLTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random generator = new Random();

        long timeOfAdding = 0;
        long timeOfFinding = 0;
        long timeOfDeleting = 0;

        //добавляем файлы в лист (для проверки на повторение) и в дерево
        int b = generator.nextInt(100000);
        Node root = new Node(b);
        AVLTree tree = new AVLTree(root);

        for (int i = 0; i < 10000; i++) {
            int a = generator.nextInt(10000);
            if (!list.contains(a)) {
                list.add(a);
                long start = System.nanoTime();
                tree.insert(tree.root, a);
                long stop = System.nanoTime();
                timeOfAdding += stop - start;
            }
        }

        for(int i = 0; i < 100; i++) {
            int a = generator.nextInt(100000);
            long start = System.nanoTime();
            tree.find(a);
            long stop = System.nanoTime();
            timeOfFinding += stop - start;
        }

        for (int i = 0; i < 1000; i++) {
            int a = generator.nextInt(10000);
            long start = System.nanoTime();
            tree.delete(a);
            long stop = System.nanoTime();
            timeOfDeleting += stop - start;
        }

        System.out.println("Среднее время добавления элемента: " + timeOfAdding / (long)10000 + " миллисекунды");

        System.out.println("Среднее количество оперций при добавлении элемента: " + AVLTree.countOfAddingOperations / 10000 + " операций");

        System.out.println("Среднее время поиска элемента: " + timeOfFinding / (long)10000 + " миллисекунды");

        System.out.println("Среднее количество оперций при поиске элемента: " + AVLTree.countOfFindingOperations / 10000 + " операций");

        System.out.println("Среднее время удаления элемента: " + timeOfDeleting / (long)10000 + " миллисекунды");

        System.out.println("Среднее количество оперций при удалении элемента: " + AVLTree.countOfDeletingOperations / 10000 + " операций");

    }
}
