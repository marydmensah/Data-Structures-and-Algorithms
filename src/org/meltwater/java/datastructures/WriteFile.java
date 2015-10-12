package org.meltwater.java.datastructures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String content = "Auto document-corrected";
			File file = new File("document-corrected.txt.");

			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
