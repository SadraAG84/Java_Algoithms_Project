package Arama_Algoritmalar;

// Binary Search Tree operations in Java

class BinarySearchTree_3_11 {
    // ikili arama agaci dugumu
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree_3_11() {
        root = null;
    }
//
    void insert(int key) {
        root = insertKey(root, key);
    }

    // agaca anahtar ekle
    Node insertKey(Node root, int key) {
        // eger agac bossa yeni bir dugum olustur ve dondur
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // anahtari dogru konuma yerlestir
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }
// artan sirada dolasma saglanir
    void inorder() {
        inorderRec(root);
    }

    // artan sirada dolasmayai gerceklestiren yardimci fonksyon
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " -> ");
            inorderRec(root.right);
        }
    }
// anahta silme
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }
// yardimci fonksyon
    Node deleteRec(Node root, int key) {
        // agac bossa dondur
        if (root == null)
            return root;

        // silinicek dugum bul
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // eger dugum tek cocuklu veya cocuksuzsa
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // eger dugum iki cocougu varsa
            // silinicek dugum yerine artan siradaki ardili
            root.key = minValue(root.right);

            // artan siradaki ardali sil
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // artan sirada ardili bul
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }


    public static void main() {
        BinarySearchTree_3_11 tree = new BinarySearchTree_3_11();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteKey(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();
        System.out.println("\n");
    }
}
