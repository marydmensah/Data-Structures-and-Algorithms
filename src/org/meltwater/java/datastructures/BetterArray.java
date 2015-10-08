package org.meltwater.java.datastructures;

import java.util.Arrays;

public class BetterArray<E>{
	Object[] arr;
	private int size;
	
	public BetterArray(){
		this(10);
	}
	public BetterArray(int size){
		arr = new Object[10];
		size = 0;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Object get(int index){
		return this.arr[index];
	}
	
	public void add(Object e){		
		if (size == arr.length) {
			Object[] newArr = new Object[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			this.arr = newArr;
		} 
		this.arr[size++] = e;
	}
	
	public void add(int pos, Object e) throws Exception{
		if(pos > size) throw new Exception();
		if (pos == size) {
			add(e);
			return;
		}else if(pos < size){
			for (int i = (size - 1); i >= pos; i--) {
				if(size == arr.length)
					add(arr[i]);
				else
					arr[i + 1] = arr[i];				
			}
			arr[pos] = e;
		}
	}
	
	
	public static void main(String[] args){
		BetterArray bt = new BetterArray();
		for (int i = 0; i < 10; i++) {
			bt.add(i);
		}
		try {
			bt.add(10,61);
		} catch (Exception e) {e.printStackTrace();}
		System.out.println(Arrays.toString(bt.arr));
	}

}
