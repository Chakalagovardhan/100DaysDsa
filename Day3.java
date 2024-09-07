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
	
	public boolean isSameTree(Node p, Node q) {
	       if(p==null && q==null)
	       {
	        return true;
	       }
	       if(p==null || q==null)
	       {
	        return false;
	       } 
	       if(p.data !=q.data)
	       {
	            return false;
	       }

	       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    }
	
}


public class Day3 {
	public static void main(String args[])
	{
		BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        // Insert data into both trees
        tree1.insertData(11);
        tree1.insertData(7);
        tree1.insertData(2);
        tree1.insertData(6);

        tree2.insertData(11);
        tree2.insertData(7);
        tree2.insertData(2);
        tree2.insertData(6);

        // Compare the root nodes of both trees
        System.out.println(tree1.isSameTree(tree1.root, tree2.root));
	}

}
