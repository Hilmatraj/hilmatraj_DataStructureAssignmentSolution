package bstToSkewed;
import java.util.Arrays;

public class LeftSkewedTree {
	
	public static class Node{
		int key;
		Node left,right;
		
		public Node(int data) {
			
			this.key=key;
			this.left=null;
			this.right=null;
			
		}
	}
	
	public Node root;
	
	int[] treeArray;
	int index=0;
	
	public LeftSkewedTree() {
		root=null;
	}
	
	public Node LeftSkewedTree(Node node) {
		int treeSize=calculateSize(node);
		treeArray =new int[treeSize];
		
		convertToArray(node);
		
		Arrays.sort(treeArray);
		Node d=BST(0,treeArray.length -1);
		return d;
	}
	
	public int calculateSize(Node node)
	{
		int size=0;
		if(node==null)
			return 0;
		else {
			size= calculateSize(node.left)+ calculateSize(node.right)+1;
			return size;
			
			
		}
	}

	public void convertToArray(Node node)
	{
		if(root==null) {
			System.out.println("Tree is empty");
			return;
		}
		else {
			if(node.left !=null)
				convertToArray(node.left);
			treeArray[index]=node.key;
			index++;
			if(node.right!=null)
				convertToArray(node.right);
			
		}
	}
	
	public Node BST(int start,int end) {
		if(start>end) {
			return null;
			
		}
		
		int mid= (start + end)/2;
		Node node=new Node (treeArray[mid]);
		
		node.left=BST(start,mid-1);
		node.right=BST(mid+1 , end);
		
		return node;
		
	}
	
	public void inorderTraversal(Node node) {
		if(root==null) {
			System.out.println("Tree is empty");
			return;
		}
		else {
			if(node.left!=null)
				inorderTraversal(node.left);
			System.out.println(node.key + "");
			if(node.right!=null)
				inorderTraversal(node.right);
		}
	}
}
