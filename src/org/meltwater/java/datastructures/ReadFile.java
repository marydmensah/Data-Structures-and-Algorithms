package org.meltwater.java.datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadFile {
	private ArrayList<String> ar;
	
	public ReadFile(){

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("/home/mary/Documents/Words.txt"));
			ar = new ArrayList<String>();

			while ((sCurrentLine = br.readLine()) != null) {
				ar.add(sCurrentLine);
			}
			//System.out.println(sCurrentLine);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
	public ArrayList<String> getList(){
		//System.out.println(ar);
		return ar;
	}
}


