package githubcode;
import java.util.ArrayList;
import java.util.List;

public class code6 {
    
    public static class Node {

        int num;
        Node left;
        Node right;

        public Node(int num) {
            this.num = num;
            left = null;
            right = null;
        }
    }

    public static class BST {
        Node root;

        public BST() {
            root = null;
        }

        public void insert(int value) {
            root = insertRecursive(root, value);
        }

        private Node insertRecursive(Node current, int num) {
            if (current == null) {
                return new Node(num);
            }

            if (num < current.num) {
                current.left = insertRecursive(current.left, num);
            } else if (num > current.num) {
                current.right = insertRecursive(current.right, num);
            }

            return current;
        }
        
        
        public boolean search(int value) {
            return searchRecursive(root, value);
        }

        private boolean searchRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }

            if (value == current.num) {
                return true;
            }

            return value < current.num
                ? searchRecursive(current.left, value)
                : searchRecursive(current.right, value);
        }
        
        
        public List<Integer> inorderTraversal() {
            List<Integer> inorderList = new ArrayList<>();
            inorderRecursive(root, inorderList);
            return inorderList;
        }
        private void inorderRecursive(Node node, List<Integer> inorderList) {
            if (node != null) {
                inorderRecursive(node.left, inorderList);
                inorderList.add(node.num);
                inorderRecursive(node.right, inorderList);
            }
         }
    }      

    public static void main(String[] args) {
        BST bst = new BST();
        
        bst.insert(50);
        bst.insert(2);
        bst.insert(12);
        bst.insert(90);
        bst.insert(25);
        
        
        List<Integer> inorderList = bst.inorderTraversal();
        System.out.println("Inorder Traversal: " + inorderList);
        
        
        
        System.out.println("Search 25: " + bst.search(25));  
        System.out.println("Search 100: " + bst.search(100));
    }
}
