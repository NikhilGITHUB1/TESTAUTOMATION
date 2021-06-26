package utils;

import org.testng.annotations.Test;
import org.testng.collections.Lists;

import io.restassured.http.ContentType;
import restapitesting.User;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.collections4.ListUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	ArrayList<Object> ls = new ArrayList<Object>();
	HashMap<String,Object> map = new HashMap<String,Object>();

	public ExcelUtils(String excelPath, String sheetName) throws IOException {

		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);	

	}


	@Test
	public void getRowCount() throws IOException {

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:" + rowCount);


	}



	@Test(dependsOnMethods = "getRowCount")
	public void getCellData() throws IOException {

		// String s = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		// System.out.println("cell value:" + s);

		//double i = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		//System.out.println("numeric cell value:" + i);

		//data formatter
		DataFormatter format=new DataFormatter();

		// dynamic code
		int rowcount =sheet.getLastRowNum();

		for(int i=1;i<=rowcount;i++) {
			Row r= sheet.getRow(i);
			int cellcount = r.getLastCellNum();

			for(int j=0;j<cellcount;j++) {

				Cell c=r.getCell(j);
				//System.out.println(format.formatCellValue(c));

				ls.add(format.formatCellValue(c));
				//ls.add("\""+format.formatCellValue(c)+"\"");
			}

		}

		List<List<Object>> subSets = ListUtils.partition(ls, 3);

		for(int i=0;i<subSets.size();i++) {

			System.out.println(subSets.get(i));
		}

	}


}
//}



