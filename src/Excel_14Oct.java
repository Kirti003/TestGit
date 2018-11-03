package SeleniumWithJars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_14Oct {

	public static void main(String[] args) throws IOException {
		
File src = new File("E:\\Excel\\Test.xlsx");
FileInputStream fis = new FileInputStream(src);

XSSFWorkbook wb = new XSSFWorkbook(fis);

//XSSFSheet Sheet1 = wb.getSheetAt(0);
XSSFSheet Sheet1 = (XSSFSheet) wb.getSheetAt(0);

//String result = Sheet1.getRow(0).getCell(0).getStringCellValue();
//System.out.println("Data"+result);
System.out.println(Sheet1.getLastRowNum());
System.out.println(Sheet1.getRow(0).getLastCellNum());

for (int i=0; i<= Sheet1.getLastRowNum();i++) {
	System.out.println("Row Numer is :"+i);
	
	for (int j=0;j<Sheet1.getRow(i).getLastCellNum();j++) {
		System.out.println(Sheet1.getRow(i).getCell(j));
	}
	
}

	}

}
