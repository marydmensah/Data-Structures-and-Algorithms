package org.meltwater.java.datastructures;

public class Stack {
	int maxSize;
	int top;
	//where the last position of the stack is
	String array[];
	
	public Stack(int n){
		maxSize = n;
		array = new String[maxSize];
		top = 0;
		
	}
	
	public boolean isEmpty(){
		if(top == 0){
			return true;
		}else {
			return false;
				
		}
	}
	public boolean isFull(){
		if(top == maxSize){
			return true;
		}
	}
	public void push(String item){
		if(top< maxSize){
			array[top]= item;
			top++;
		}else {
			System.println.out("Stack Overflow!");
		}
	}
	public String pop(){
		if(!this.isEmpty()){
			String temp = this.peek();
			array[top-1] = null;
			top--;
			return temp;
		}else{
			return null;
		}
	}
	public String peek(){
		if (top > 0){
			return array[top-1];
		}else{
			return null;
		}
		
	}
	public static void main(String[] args){
		Stack theStack = new Stack(5);
		theStack.push(23);
		theStack.push(34);
		theStack.push(43);
		theStack.push(52);
		theStack.push(68);
		System.out.println("");
		
	}

}
