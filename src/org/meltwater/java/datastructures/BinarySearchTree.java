package org.meltwater.java.datastructures;

public class BinarySearchTree<E>{
	public Node root;
	
	BinarySearchTree(){
		this.root = null;
	}
	
	public void add(int element){
			Node newNode = new Node(element);
			if(root == null){
				root = newNode;
			}
			else{
				Node focusNode = root;
				Node head = null;
				
				while(true){
					head = focusNode;
					if(element < focusNode.data){
						if(focusNode == null){
							head.left = newNode;
							return;
						}
					}else {
						focusNode = focusNode.right;
						if (focusNode == null){
							head.right = newNode;
							return;
						}
					}
				}
			}
	}
	public boolean remove(int id){
		Node parent = root;
		Node current = root;
		boolean isLeft = false;
		while(current.element!=id){
			parent = current;
			if(current.element>id){
				isLeft = true;
				current = current.left;
			}else{
				isLeft = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeft ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeft){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeft){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeft){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
		
		

	public int size{
		return this.size;
		
	}
	public boolean contain (int id){
		Node current = root;
		while(current!=null){
			if(current.element==id){
				return true;
			}else if(current.element>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;

	}
	public boolean contains(E item) throws ClassCastException {
        if(root == null) return false;
        return root.contains(item);
	}
	
	public void smallest{
		
	}
	public void largest{
		
	}
	public void toString{
		
	}

}
class Node {
	int element;
	Node left;
	Node right;
	
	public Node(int element){
		this.element = element;
		left = null;
		right= null;
		
	}

}

