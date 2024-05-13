package AVLTree;

public interface Leavable {
    Node insert(Node root,int key);
    Node delete(Node root, int key);
    Node find(Node root, int key);
}
