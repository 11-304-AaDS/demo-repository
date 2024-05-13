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

        List<Long> timeOfAdding = new ArrayList<>();
        List<Integer> countOfAddingOperations = new ArrayList<>();

        List<Long> timeOfFinding = new ArrayList<>();
        List<Integer> countOfFindingOperations = new ArrayList<>(); //хранит результаты есть или нет в дереве

        List<Long> timeOfDeleting = new ArrayList<>();
        List<Integer> countOfDeletingOperations = new ArrayList<>();

        //добавляем файлы в лист (для проверки на повторение) и в дерево
        int b = generator.nextInt(100000);
        Node root = new Node(b);
        AVLTree tree = new AVLTree(root, countOfAddingOperations, countOfFindingOperations, countOfDeletingOperations);
        for (int i = 0; i < 10000; i++) {
            int a = generator.nextInt(100000);
            if (!list.contains(a)) {
                list.add(a);
                long start = System.nanoTime();
                tree.insert(root, a);
                long stop = System.nanoTime();
                timeOfAdding.add(stop - start);
            }
        }

        for(int i = 0; i < 100; i++) {
            int a = generator.nextInt(10000);
            long start = System.nanoTime();
            tree.find(a);
            long stop = System.nanoTime();
            timeOfFinding.add(stop - start);
        }

        for (int i = 0; i < 1000; i++) {
            int a = generator.nextInt(100000);
            long start = System.nanoTime();
            tree.delete(a);
            long stop = System.nanoTime();
            timeOfDeleting.add(stop - start);
        }


        Long sumOfAddingTime = timeOfAdding.stream()
                .collect(Collectors.summingLong(Long::longValue));
        System.out.println("Среднее время добавления элемента: " + sumOfAddingTime / (long)10000 + " миллисекунды");

        Integer sumOfAddingOperations = countOfAddingOperations.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Среднее количество оперций при добавлении элемента: " + sumOfAddingOperations / 10000 + " операций");

        Long sumOfFindingTime = timeOfFinding.stream()
                .collect(Collectors.summingLong(Long::longValue));
        System.out.println("Среднее время поиска элемента: " + sumOfFindingTime / (long)10000 + " миллисекунды");

        Integer sumOfFindingOperations = countOfFindingOperations.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Среднее количество оперций при поиске элемента: " + sumOfFindingOperations / 10000 + " операций");

        Long sumOfDeletingTime = timeOfDeleting.stream()
                .collect(Collectors.summingLong(Long::longValue));
        System.out.println("Среднее время удаления элемента: " + sumOfDeletingTime / (long)10000 + " миллисекунды");

        Integer sumOfDeletingOperations = countOfDeletingOperations.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Среднее количество оперций при удалении элемента: " + sumOfDeletingOperations / 10000 + " операций");

    }
}
