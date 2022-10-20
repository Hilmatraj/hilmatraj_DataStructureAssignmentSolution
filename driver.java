package bstToSkewed;

import bstToSkewed.LeftSkewedTree.Node;
public class driver {

	public static void main(String[] args) {
		
		
		LeftSkewedTree tree=new LeftSkewedTree();
		tree.root=new Node(50);
		tree.root.left=new Node(30);
		tree.root.right=new Node(60);
		tree.root.left.left=new Node(10);
		tree.root.left.right=new Node(55);
		
		Node bst =tree.LeftSkewedTree(tree.root);
		tree.inorderTraversal(bst);
		

	}

}
