package data_driven_Framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Run {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("TestData\\Samplebook.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet Sheet=book.getSheet("SampleSheet");
	
		XSSFRow Row=Sheet.getRow(0);
		
		String Cell0_Value=Row.getCell(0).getStringCellValue();
		
		System.out.println(Cell0_Value);
		
		String Cell1_Value=Row.getCell(1).getStringCellValue();
		
		System.out.println(Cell1_Value);
		
		long Cell2_Value=(long) Row.getCell(2).getNumericCellValue();
		
		System.out.println(Cell2_Value);
		
		XSSFRow Row1=Sheet.getRow(1);
		
		String Row1Cell0_Value=Row1.getCell(0).getStringCellValue();
		
		System.out.println(Row1Cell0_Value);
		
		String Row1Cell1_Value=Row1.getCell(1).getStringCellValue();
		
		System.out.println(Row1Cell1_Value);
		
		long Row1Cell2_Value=(long) Row1.getCell(2).getNumericCellValue();
		
		System.out.println(Row1Cell2_Value);
		
		XSSFRow Row2=Sheet.getRow(2);
		
		String Row2Cell0_Value=Row2.getCell(0).getStringCellValue();
		
		System.out.println(Row2Cell0_Value);
		
		String Row2Cell1_Value=Row2.getCell(1).getStringCellValue();
		
		System.out.println(Row2Cell1_Value);
		
		long Row2Cell2_Value= (long) Row2.getCell(2).getNumericCellValue();
		
		System.out.println(Row2Cell2_Value);
	}

}
