package Patterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WorkWithExcel {
	
	public static void main (String[] args) throws IOException {
	int i=0 , j=0 ; String c;
	
	File src=new File("D:\\testdata.xls");
	FileInputStream fis=new FileInputStream(src);
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	HSSFSheet sh1= wb.getSheetAt(0);
	int rownum = (sh1.getLastRowNum() + 1);
	int sheetnumber = 0;
	writerow(src,wb,sh1,sheetnumber,rownum, 16,"Bbijender",10,102);

}
	
	public static void writerow (File src,HSSFWorkbook wb, HSSFSheet newsheet, int sheetnum, int rownN,int roll,String name, int cls, int ID) throws IOException {
		FileInputStream fis = new FileInputStream(src);	
		Row row = newsheet.createRow(rownN);
		createcell(src,wb,row,0,roll);
		createcell(src,wb,row,1,name);
		createcell(src,wb,row,2,cls);
		createcell(src,wb,row,3,ID);
		
		
	}
	
/*	public static void writerow (File src,HSSFWorkbook wb, HSSFSheet newsheet, int sheetnum, int rownN,int column,int value) throws IOException {
		FileInputStream fis = new FileInputStream(src);	
		Row row = newsheet.createRow(rownN);
		createcell(src,wb,row,column,value);
		 
		
	}*/
	public static void createcell(File src,HSSFWorkbook wb,Row row,int column, String value) throws IOException {
		Cell cell = row.createCell(column);	
		cell.setCellValue(value);		 
		FileOutputStream fos = new FileOutputStream(src);		 
		wb.write(fos);		
	}
	public static void createcell(File src,HSSFWorkbook wb,Row row,int column, int value) throws IOException {
		Cell cell = row.createCell(column);		 
		cell.setCellValue(value);		 
		FileOutputStream fos = new FileOutputStream(src);		 
		wb.write(fos);		
	}
}
