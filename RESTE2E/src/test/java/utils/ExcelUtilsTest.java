package utils;

import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

public class ExcelUtilsTest {

	String dir=System.getProperty("user.dir");
	String excelpath=dir + "/data/data.xlsx";
	String sheetname= "Sheet1";
	ExcelUtils excel;

	@Test
	public void testExcel() throws IOException {

		excel=new ExcelUtils(excelpath, sheetname);

		excel.getRowCount();
		excel.getCellData();
		
	

	}

}
