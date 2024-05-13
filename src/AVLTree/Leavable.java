package AVLTree;

public interface Leavable {
    Node insert(Node root,int key);
    void delete(int key);
    Node find(Node root, int key);
}
