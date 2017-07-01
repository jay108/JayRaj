package com.jay;
import java.util.*;
class Tree
{
	Tree lchild;
	int data;
	Tree rchild;
	public Tree()
	{
		lchild=null;
		rchild=null;
	}
	public Tree(Tree t,int n)
	{
		data=n;
		this.lchild=t.lchild;
		this.rchild=t.rchild;
	}
	public void setLeftLink(Tree t)
	{
		t.lchild=lchild;
	}
	public void setRightLink(Tree t)
	{
		t.rchild=rchild;
	}
	public Tree getLeftLink()
	{
		return lchild;
	}
	public Tree getRightLink()
	{
		return rchild;
	}
}
public class BinarySearch 
{
	Tree node,root;
	/*public static  void setRoot(Tree root)
	{
		root=root;
	}
	public static Tree getRoot()
	{
		return root;
	}*/
	public void insertNode(Tree temproot,Tree nptr)
	{
		if(nptr.data < temproot.data)
		{
			if(temproot.lchild==null)
			{
				temproot.lchild=nptr;
			}
			else
			{
				insertNode(temproot.lchild,nptr);
			}
		}
		else
		{
			if(temproot.rchild==null)
			{
				temproot.rchild=nptr;
			}
			else
			{
				insertNode(temproot.rchild,nptr);
			}
		}
	}
	public void createBinaryNode()
	{
		Scanner in=new Scanner(System.in);
		Tree nptr=new Tree();
		System.out.println("Enter Data into Binary Tree");
		nptr.data=in.nextInt();
		if(root==null)
		{
			System.out.println("Binary tree is Now Initialized..");
			root=nptr;			
			root.lchild=null;
			root.rchild=null;
			System.out.println(root);
		}
		else
		{
			insertNode(root,nptr);
		}
	}
	public void displayBinary(Tree root)
	{
		System.out.println(root.data);
		if(root.lchild!=null)
		{
			displayBinary(root.lchild);
			//System.out.println("Data On Left Side******");
		}
		/*else
		{
			System.out.println("Left Node is Empty..");
		}*/
		if(root.rchild!=null)
		{
			displayBinary(root.rchild);
			System.out.println("Data on right side******");
		}
		/*else
		{
			System.out.println("Right Node is Empty.");
		}*/
	}
	public static void main(String[] args) 
	{		
		Scanner in=new Scanner(System.in);
		int ch;
		BinarySearch bs=new BinarySearch();
		System.out.println("******************Binary Search Tree Program*******************");
		while(true)
		{
			System.out.println("Enter 1 for Create Binary Tree..");
			System.out.println("Enter 2 for Display The Binary Tree.");
			System.out.println("Enter 3 for Traverse The Tree.");
			System.out.println("Enter 4 for Exit.");
			System.out.println("Enter Your Choice:");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Creating Node****************");
				bs.createBinaryNode();
				break;
				case 2:
				bs.displayBinary(bs.root);
				System.out.println("That is Data of Binary Tree..");
				break;
				case 4:
					System.out.println("Terminating************");
					System.exit(0);
				default:
					System.out.println("Invalid choice..");
			}
				System.out.println("Wants to continue(y/n):? ");
				System.out.println("If no then Press 4 to Exit.");
		}				
	}
}
