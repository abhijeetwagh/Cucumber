package Temp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 *This java program is used to read the data from a Excel file and display them
 * on the console output. 
 * 
 */

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("E:\\CUCUMBER\\Excel Operations\\Excel_Operations.xlsx");

		// Get the workbook instance for XLS file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);

		// ---to get total number of rows
		int val = sheet.getLastRowNum();

		// ---to get all columns from the first row
		int value = sheet.getRow(0).getLastCellNum();

		// ---in order to get the data from specific cell from row 1 and column
		String CellVal = sheet.getRow(1).getCell(1).toString();

		// ---in order set the data
		sheet.getRow(1).getCell(1).setCellValue("ejagruti");

		try (FileOutputStream outputstream = new FileOutputStream(
				"E:\\CUCUMBER\\Excel Operations\\Excel_Operations.xlsx")) {
			workbook.write(outputstream);
		}
		System.out.println(val);
		System.out.println(value);
		System.out.println(CellVal);
	}

}
