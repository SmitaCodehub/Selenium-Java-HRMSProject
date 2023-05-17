package in.WebDriver.Example;


//Progrm to retrieve data from excel .XLSX file
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;


public class TC0012_Excel_XSLX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\Patil\\eclipse-workspace\\AutomationProject\\src\\in\\WebDriver\\Example\\WriteExcel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("Test");
		
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before writing: "+ sheet.getRow(2).getCell(1));
		
		//write data to excel file
		XSSFCell cell=sheet.getRow(2).getCell(1);
		cell.setCellValue("Krishna");
		file.close();
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Patil\\eclipse-workspace\\AutomationProject\\src\\in\\WebDriver\\Example\\WriteExcel.xlsx");
		
		workbook.write(fout);
		
		System.out.println("Updated File : "+cell.getStringCellValue());
		
		fout.close();
	}

}
