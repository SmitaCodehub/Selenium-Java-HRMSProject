package in.WebDriver.Example;


// Progrm to retrieve data from excel .XLS file
import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

public class TC012_Excelfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\Patil\\eclipse-workspace\\AutomationProject\\src\\in\\WebDriver\\Example\\TestExcel.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
	
		int rowcount=st.getRows();
		
		System.out.println("Row Count: "+rowcount);
		for(int i=0;i<rowcount;i++)
		{
		String empid=st.getCell(0,i).getContents();
		String name=st.getCell(1,i).getContents();
		String email=st.getCell(2,i).getContents();
		String mobile=st.getCell(3,i).getContents();
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		}
		file.close();
	}

}
