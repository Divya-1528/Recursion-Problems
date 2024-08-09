public class Binary_or_not {
        static class Node {
            public int data;
            public Node left;
            public Node right;
    
            //constructor
            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        
        public Node root;
    
        public Binary_or_not() {
            this.root = null;
        }
        public boolean isBSTOrNot() {
            return isBSTOrNot(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    
        private boolean isBSTOrNot(Node root, int minValue, int maxValue) {
            
            if (root == null) {
                return true;
            }
           
            if(root.data >= minValue && root.data <= maxValue && isBSTOrNot(root.left, minValue, root.data) && isBSTOrNot(root.right, root.data, maxValue)){
                return true;
            }
            return false;
        }
    
        public static void main(String[] args) {
            // Creating the object of BinaryTree class
            Binary_or_not bt = new Binary_or_not();
            bt.root= new Node(100);
            bt.root.left= new Node(90);
            bt.root.right= new Node(110);
            bt.root.left.left= new Node(80);
            bt.root.left.right= new Node(95);
            System.out.println(bt.isBSTOrNot());
    
        }
    }
    

