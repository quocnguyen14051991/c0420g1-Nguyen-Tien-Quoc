package introductionToJava.javacollectionframework.baitap.b.baitapcaynhiphan;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private int size;
    public TreeNode root;

    public BST() {
        this.size = 0;
        this.root = null;
    }

    public void insertAt(TreeNode<E> newNode) {

        this.root = insertAt(this.root, newNode);
    }

    private TreeNode insertAt(TreeNode<E> root, TreeNode<E> newNode) {
        // todo insert 1 node tại vị trí node nào?? private để trong sài :)) để public bên ngoài gọi :v
        if (root == null) {
            this.size++;
            return newNode;
        }
        if (newNode.element.compareTo(root.element) < 0) {
            root.left = insertAt(root.left, newNode);
        } else if (newNode.element.compareTo(root.element) > 0) {
            root.right = insertAt(root.right, newNode);
        } else {
            this.size--;
        }
        return root;
    }

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public TreeNode search(E value) {
        return search(this.root, value);
    }

    private TreeNode search(TreeNode<E> node, E value) {
        if (node == null) return null;
        if (node.element.compareTo(value) == 0) {
            return node;
        }
        if (node.element.compareTo(value) > 0) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }


    public void delete(E e) {
        this.root = delete(this.root, e);
    }

    private TreeNode delete(TreeNode<E> node, E e) {
        if (node == null) return null;
        if (node.element.compareTo(e) == 0) {
            this.size--;
            if (node.left == null) {
                return node.right;
            }
            TreeNode<E> maxNode = node.left;
            TreeNode<E> preNode = maxNode;
            while (maxNode.right != null) {
                preNode = maxNode;
                maxNode = maxNode.right;
            }
            maxNode.right = node.right;
            if (maxNode != node.left) {
                maxNode.left = node.left;
                preNode.right = null;
            }
            return maxNode;
        }
        if (node.element.compareTo(e) > 0) {
            node.left = delete(node.left, e);
        } else {
            node.right = delete(node.right, e);
        }

        return node;
    }

    public void PrintPreOrder() {
        PrintPreOrder(this.root);
    }

    private void PrintPreOrder(TreeNode<E> node) {
        if (node == null) return;
        node.printData();
        PrintPreOrder(node.left);
        PrintPreOrder(node.right);
    }

    public void printInOrder() {
        printInOrder(this.root);
    }

    private void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        node.printData();
        printInOrder(node.right);
    }

    public void printPostOrder() {
        printPostOrder(this.root);
    }

    private void printPostOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        node.printData();
    }

    public TreeNode<E> CreatNode(E e) {
        return new TreeNode<>(e);
    }
}
