package Patterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class htmlInJava {

	public static void main (String[] args) throws IOException {
		htmlcode("Bijender","is","Coder", "True");	
		
	
		
	}
	public static void htmlcode(String... a) throws IOException {
		String b1 = null,b2=null,b3=null;
		File f = new File("C:\\Users\\bijenderprasad\\Desktop\\html\\test.html");
		f.createNewFile();
		FileWriter fw=new FileWriter(f,false);
		String test_html="<html>\r\n" + 
				"		<head>\r\n" + 
				"		<title>b1</title>\r\n" + 
				"		</head>\r\n" + 
				"		<body>\r\n" + 
				"\r\n" + 
				"		<h1>b2</h1>\r\n" + 
				"		<p style=\"color=red\">b3</p>\r\n" + 
				"b4"+
				"\r\n" + 
				"		</body>\r\n" + 
				"		</html>";
		int num=0;
		for (String x : a) {
			test_html=test_html.replace("b"+(++num), x); 
		}
		
	
		fw.write(test_html);
		fw.flush();
	}

}
