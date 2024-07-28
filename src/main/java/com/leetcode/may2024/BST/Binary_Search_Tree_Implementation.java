package com.leetcode.may2024.BST;

public class Binary_Search_Tree_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST tree= new BST();

		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();  // Output: 20 30 40 50 60 70 80
        System.out.println(tree.search(20)); 
        tree.deleteKey(70);
        tree.insert(180);
        tree.inorder();  // Output: 20 30 40 50 60 70 80
 
	}
	

}

 
