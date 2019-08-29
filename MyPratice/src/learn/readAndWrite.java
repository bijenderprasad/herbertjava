package Patterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class readAndWrite {
	static String line = null;

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\bijenderprasad\\Desktop\\test.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter("C:\\Users\\bijenderprasad\\Desktop\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(f.exists());
		while ((line = br.readLine()) != null) {

			System.out.println(line);
		}
		
		String s = "This is my program";
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.flush();
		pw.close();


		while ((line = br.readLine()) != null) {

			System.out.println(line);
		}
		
	}
	
	
	

}
