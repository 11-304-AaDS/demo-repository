package AVLTree;

import java.util.ArrayList;
import java.util.List;

public class AVLTree implements Leavable{
    public Node root;
    //так как при подсчете среднего мы знаем точное кол-во элементов и суммируем все элементы,
    //можно добавлять независимые счетчики не суммируя их предварительно между собой (из методов insert, rebalance и rotate)
    List<Integer> countOfAddingOperations = new ArrayList<>();
    List<Integer> countOfFindingOperations = new ArrayList<>();
    List<Integer> countOfDeletingOperations = new ArrayList<>();

    AVLTree(Node root, List<Integer> add, List<Integer> find, List<Integer> delete) {
        this.root = root;
        this.countOfAddingOperations = add;
        this.countOfFindingOperations = find;
        this.countOfDeletingOperations = delete;
    }

    public Node insert(Node root,int key) {
        int counter = 0;
        if (root == null) {
            root = new Node(key);
            counter++;
        }
        if (root.key > key) {
            if (root.left == null) root.left = new Node(key);
            else root.left = insert(root.left, key);
            counter++;

        } else {
            if (root.right == null) root.right = new Node(key);
            else root.right = insert(root.right, key);
            counter++;
        }
        counter++;
        countOfAddingOperations.add(counter);
        return rebalanced(root);
    }

    public Node find(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return find(root.left, key);
        }

        return find(root.right, key);
    }

    public void delete(int key) {
        int counter = 0;
        Node node = find(root, key);
        counter++;
        if (node != null) {
            if (node.left == null & node.right == null) {
                node = null;
            } else {
                Node left = node.right;
                Node prev = left;
                while (left != null) {
                    prev = left;
                    left = left.left;
                    counter++;
                }
                node = prev;
                prev = null;
            }
            counter++;
        }
        counter++;
        countOfDeletingOperations.add(counter);
    }

    private Node rebalanced(Node node) {
        int counter = 0;
        updateHeight(node);
        counter++;
        int balance = height(node.right) - height(node.left);
        if (balance > 1) {
            if (height(node.right.left) > height(node.right.right)){
                node.right = rotateRight(node.right);
                counter++;
            }
            node = rotateLeft(node);
            counter++;
        } else if (balance < -1) {
            if (height(node.left.right) > height(node.left.left)){
                node.left = rotateLeft(node.left);
                counter++;
            }
            node = rotateRight(node);
            counter++;
        }
        counter++;
        countOfAddingOperations.add(counter);
        return node;
    }


    private Node rotateLeft(Node node) {
        Node root = node.right;
        node.right = root.left;
        root.left = node;
        updateHeight(node);
        updateHeight(root);
        countOfAddingOperations.add(5);
        return root;
    }

    private Node rotateRight(Node node) {
        Node root = node.left;
        node.left = root.right;
        root.right = node;
        updateHeight(node);
        updateHeight(root);
        countOfAddingOperations.add(5);
        return root;
    }


    private int height(Node node) {
        return node == null? -1 : node.height;
    }

    private void updateHeight(Node node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }
}
