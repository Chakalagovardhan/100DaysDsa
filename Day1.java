package com.telusko;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

class BinaryTree{
	
	Node node;
	public BinaryTree()
	{
		node=null;
	}
	
	public void insertData(int data)
	{
		node=insertRec(node,data);
	}
	
	public Node insertRec(Node node,int data)
	{
		if(node==null)
		{
			node=new Node(data);
		}
		if(data<node.data)
		{
			node.left=insertRec(node.left,data);
		}
		else if(data>node.data)
		{
			node.right=insertRec(node.right,data);
		}
		return node;
			
	}
	
	public void LevelorderTraversal(Node node)
	{
		if(node==null)
		{
			System.out.println("Tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			Node currentNode=queue.poll();
			System.out.print(currentNode.data+" ");
			if(currentNode.left != null)
			{
				queue.add(currentNode.left);
			}
			if(currentNode.right != null)
			{
				queue.add(currentNode.right);
			}
		}
	}
	
}

public class Day1 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insertData(11);
		tree.insertData(13);
		tree.insertData(15);
		tree.insertData(19);
		tree.insertData(26);
		tree.insertData(17);
		tree.insertData(23);
		tree.insertData(21);
		tree.insertData(22);
		tree.insertData(25);
		
		
		tree.LevelorderTraversal(tree.node);
		
	}

}
