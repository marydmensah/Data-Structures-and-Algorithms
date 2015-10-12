package org.meltwater.java.datastructures;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker{
	public static void main(String[] args){
		System.out.println("please input your word.");
		
		Scanner inputWord = new Scanner(System.in);
		String statement = inputWord.next();
		statement.toLowerCase();
		
		boolean correct = false;
		ReadFile readfile = new ReadFile();
		ArrayList<String> returnedList = readfile.getList();
		//System.out.println(returnedList);
		
		for (int counter = 0; counter < returnedList.size(); counter++) { 	
			if (returnedList.get(counter).equals(statement)){
				System.out.println("The word is correct!");
				correct = true;
				break;
			}
		} 

		if (correct==false){
			System.out.println("The word is wrong!");
		}
	}
}	
