package DataStructures;

import java.util.*;
import java.util.LinkedList;


class Node
{
	int key;
	Node left;
	Node right;
	public Node(int key, Node left, Node right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
	public Node(int key) {
		super();
		this.key = key;
	}
	
}
public class BinaryTreeRecurrsion 
{
	private Node left=null;
	private Node right=null;
	private Node root=null;
	private int count=0;
	private boolean flag;
	public boolean add(int k)
	{
		flag=false;
		root=addNode(k, root);
		return flag;
	}
	private Node addNode(int k,Node n)
	{
		if(n==null)
		{
			n=new Node(k);
			count++;
			flag=true;
			return n;
		}
		if(k<n.key) n.left=addNode(k, n.left);
		else if(k>n.key) n.right=addNode(k, n.right);
		return n;
	}
	public int size()
	{
		return count;
	}
	public void levelOrderTraverse()
	{
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty())
		{
			Node n = q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
	}
	private void preorder(Node n)
	{
		if(n==null) return;
		System.out.println(n.key);
		preorder(n.left);
		preorder(n.right);
	}
	public void preordertraverse()
	{
		preorder(root);
	}
	private void postorder(Node n)
	{
		if(n==null) return;
		postorder(n.left);
		postorder(n.right);
		System.out.println(n.key);
	}
	public void postordertraverse()
	{
		postorder(root);
	}
	private void inorder(Node n)
	{
		if(n==null) return;
		inorder(n.left);
		System.out.println(n.key);
		inorder(n.right);
		
	}
	public void inordertraverse()
	{
		inorder(root);
	}
	public static void main(String[] args) 
	{
		BinaryTreeRecurrsion b = new BinaryTreeRecurrsion();
		b.add(50);
		b.add(25);
		b.add(10);
		b.add(40);
		b.add(75);
		b.add(60);
		b.add(100);
		
		System.out.println(b.size());
		b.levelOrderTraverse();
		b.preordertraverse();
	}
}
