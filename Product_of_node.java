
import java.util.*;
class Product_of_nodes
{

// Binary Tree Node
static class Node {
	int key;
	Node left, right;
};

/* utility that allocates a new Node 
with the given key */
static Node newNode(int key)
{
	Node node = new Node();
	node.key = key;
	node.left = node.right = null;
	return (node);
}

// Function to find product of
// all the nodes
static int productBT(Node root)
{
	if (root == null)
		return 1;

	return (root.key * productBT(root.left) * productBT(root.right));
}

// Driver Code
public static void main(String args[])
{
	// Binary Tree is:
	//	 1
	//	 / \
	//	 2 3
	// / \ / \
	// 4 5 6 7
	//		 \
	//		 8
	Node root = newNode(1);
	root.left = newNode(2);
	root.right = newNode(3);
	root.left.left = newNode(4);
	root.left.right = newNode(5);
	root.right.left = newNode(6);
	root.right.right = newNode(7);
	root.right.left.right = newNode(8);

	int prod = productBT(root);

	System.out.println( "Product of all the nodes is: "+prod);

}
}

