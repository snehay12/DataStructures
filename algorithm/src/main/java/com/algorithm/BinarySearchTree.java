package com.algorithm;

public class BinarySearchTree {

	class Node
	{
		private int key;
		private String value;
		Node right, left;
		
		Node(int key,String value)
		{
			this.key=key;
			this.value=value;
		}
		
		public Node min()
		{
			if(left==null)
			{
				return left;
			}
			return left.min();
		}
	}
	
	Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public String find(int key)
	{
			Node node= find(root, key);
			
			return node==null?null: node.value;
	}
	
	private Node find(Node root, int key)
	{
		if(root==null||root.key==key)
			return root;
		if(key>root.key)
			return find(root.right,key);
		else
			return find(root.left,key);
	}
	
	public void insert(int key, String value)
	{
		root = insertItem(root,key,value);
	}
	
	private Node insertItem(Node node, int key, String value)
	{
		Node newNode = new Node(key,value);
		if(node==null)
		{
			node=newNode;
			return node;
		}
		if(key>node.key)
			insertItem(node.right, key, value);
		else
			insertItem(node.left, key, value);
		return node;
	}
	public void delete(int key)
	{
		root = deleteItem(root,key);
	}
	 public Node findMin(Node node) {
	        return node.min();
	    }

	private Node deleteItem(Node node, int key)
	{
		if(node==null)
			return null;
		if(key>node.key)
			node.right= deleteItem(node.right,key);
		else
			node.left= deleteItem(node.left,key);
		
		if(node.right==null && node.left==null)
		{
			node=null;
		}
		else if(node.left==null)
			node= node.right;
		else if(node.right==null)
			node=node.right;
		else
		{
			Node nodeMin=findMin(node.right);
			node.key=nodeMin.key;
			node.value=nodeMin.value;
			node.right=deleteItem(node.right,node.key);
		}
		return node;
	}
}
