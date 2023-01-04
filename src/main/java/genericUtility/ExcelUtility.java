package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {

	public Object[][] readMultipleData(String SheetName) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int lastRow = sh.getLastRowNum()+1;
		int lastCel = sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastRow][lastCel];
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCel;j++)
			{
				obj[i][j]= sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
	
	public String readDataFromExcel(String SheetName, int RowNo, int ColumnNo  ) throws Throwable {
        FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet(SheetName);
		Row ro = sh.getRow(RowNo);
		Cell cel = ro.getCell(ColumnNo);
		String value = cel.getStringCellValue();
		wb.close();
		return value;
	}
}
