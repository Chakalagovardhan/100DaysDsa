package com.telusko;

class Node{
	int data;
	Node right,left;
	Node(int data)
	{
		this.data=data;
		right=left=null;
	}
}
class BinaryTree
{
	Node root;
	public  BinaryTree()
	{
		root=null;
	}
	public void insertData(int data)
	{
		root=insertRec(root,data);
	}
	public Node insertRec(Node node,int data)
	{
		if(node==null)
		{
			node=new Node(data);
			return node;
		}
		if(data<node.data)
		{
			node.left=insertRec(node.left,data);
		}
		else if(data>node.data){
			node.right=insertRec(node.right,data);
			
		}
		return node;
	}
	
	public int BSTHeight(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else {
			int ldepth=BSTHeight(node.left);
			int rdepth=BSTHeight(node.right);
			if(ldepth>rdepth)
			{
				return(ldepth+1);
				
			}
			else {
				return (rdepth+1);
			}
		}
		
		
	}
	
}


public class Day2 {
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.insertData(11);
		tree.insertData(7);
		tree.insertData(2);
		tree.insertData(6);
		tree.insertData(11);
		tree.insertData(5);
		tree.insertData(9);
		tree.insertData(9);
		tree.insertData(5);
		
		System.out.println(tree.BSTHeight(tree.root));
	}
	
	

}
