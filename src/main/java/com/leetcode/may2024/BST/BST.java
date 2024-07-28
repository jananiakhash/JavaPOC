package com.leetcode.may2024.BST;

public class BST {

	Node root;

	public BST() {
		root = null;
	}
	public void insert(int key) {

		root = insertRec(root, key);

	}

	// Recursive method to insert a new key
	
	private Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			
			 root.left = insertRec(root.left, key);
			 
		} else if(key > root.key) {
			
			 root.right = insertRec(root.right, key);
			 
		}
		
      return root;
	}

	// Search for a key in the BST
	public boolean search(int key) {

		return searchRec(root, key);

	}

	// Recursive method to search for a key
	public boolean searchRec(Node root, int key) {

		if (root == null) {
			return false;
		}
		if (root.key == key) {
			return true;
		}
		if (root.key < key) {
			return searchRec(root.right, key);
		}
		return searchRec(root.left, key);

	}


	// In-order traversal of the BST
	public void inorder() {
		inorderRec(root);
	}

	// Recursive method to do in-order traversal
	private void inorderRec(Node root) {

		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}

	}
	
	public void deleteKey(int key) {
        root = deleteRec(root, key);
    }

	private Node deleteRec(Node root, int key) {
		
        // If tree is empty
        if (root == null) return root;

        // Find the number
        
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
        	
            // Found the number to be deleted

            // No children or one child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Two children
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    // Find the smallest number in a branch
	private int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

}


