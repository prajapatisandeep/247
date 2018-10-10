package automationUtility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class TestData {

	static Workbook bookObj;
	static Sheet sheetObj;
	static Row rowObj;
	static Cell cellObj;

	public static void main(String[] args) {
		getRowDataForSignUp();
	}
	
	
	public static ArrayList<String> getTestData(String testCaseID) {
		if (bookObj == null) {
			loadTestData();
		}
		sheetObj = bookObj.getSheet("SignUp");
		// We need to know required row number
		int requiredROwNumber = getRequiredRowNumber(testCaseID);
		if (requiredROwNumber == 0) {
			throw new RuntimeException("Test Case ID :" + " " + testCaseID + " does not exist");

		}
		ArrayList<String> testData = addDataOfRowInList(requiredROwNumber);
		return testData;
	}

	private static ArrayList<String> addDataOfRowInList(int requiredROwNumber) {
		rowObj = sheetObj.getRow(requiredROwNumber);
		ArrayList<String> testData = new ArrayList<String>();
		int lastCell = rowObj.getLastCellNum();
		for (int i = 1; i < lastCell; i++) {
			cellObj = rowObj.getCell(i, MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String cellValue = "";
			try {
				cellValue = cellObj.getStringCellValue();
			} catch (Exception e) {
				long value = (long) cellObj.getNumericCellValue();
				cellValue = Long.toString(value);
			}
			testData.add(cellValue);
		}
		return testData;
	}

	private static int getRequiredRowNumber(String testCaseID) {
		int lastRowNum = sheetObj.getLastRowNum();
		int requiredRowNumber = 0;
		for (int i = 1; i <= lastRowNum; i++) {
			rowObj = sheetObj.getRow(i);
			cellObj = rowObj.getCell(0);
			String cellValue = cellObj.getStringCellValue();
			// System.out.println(cellValue);
			if (cellValue.equalsIgnoreCase(testCaseID)) {
				requiredRowNumber = i;
				break;
			}
		}
		return requiredRowNumber;
	}

	private static void loadTestData() {
		String filePath = "247/TestData.xls";
		String[] arr = filePath.split("\\.");
		try {
			FileInputStream fileObj = new FileInputStream(filePath);
			if (arr[1].equalsIgnoreCase("xls")) {
				bookObj = new HSSFWorkbook(fileObj);
			} else {
				bookObj = new XSSFWorkbook(fileObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public static void getRowDataForSignUp() {
	if (bookObj == null) {
		loadTestData();
	}
	sheetObj = bookObj.getSheet("SignUp");
	int lastRowNumber= sheetObj.getLastRowNum();
	for (int i = 1; i < lastRowNumber; i++) {
		rowObj= sheetObj.getRow(i);
		cellObj= rowObj.getCell(i);
		String cellValue = cellObj.getStringCellValue();
		System.out.println(cellValue);
		
	}
	
	
}
	
	
	
	

}
