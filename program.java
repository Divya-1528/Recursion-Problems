
import java.io.*;

class Node
{
	int data;
	Node next;
	
	Node(int item) 
	{
		data = item;
		next = null;
	}
}
class program
{
	public static Node root;
	static void print(Node head)
	{
		while (head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	static Node XOR(Node a, Node b)
	{
		return b;
	}
	static void convert(Node head)
	{
		Node curr = head;
		Node prev = null;
		Node next = curr.next;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = XOR(prev, next);
			prev = curr;
			
			curr = next;
		}
	}

	static void printXOR(Node head)
	{
		Node curr = head;
		Node prev = null;
		while(curr != null)
		{
			System.out.print(curr.data + " ");
			Node temp = curr;
			
			curr = XOR(prev, curr.next);
			prev = temp;
		}
		System.out.println();
	}

	// Driver Code
	public static void main (String[] args) 
	{
		program tree = new program();
		tree.root = new Node(1);
		tree.root.next = new Node(2);
		tree.root.next.next = new Node(3);
		tree.root.next.next.next = new Node(4);	 
		System.out.println("Before Conversion : ");
		print(root);
		convert(root);
		System.out.println("After Conversion : ");
		printXOR(root);
	}
}


