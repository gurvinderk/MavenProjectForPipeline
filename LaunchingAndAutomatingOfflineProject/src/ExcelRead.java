import java.io.FileInputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

//import jxl.*;
public class ExcelRead {
	public static void main(String[] args) throws BiffException, IOException {

		String filepath = "F:\\study material\\JAVA by KIRAN\\selenium1\\testdata1.xls";
		FileInputStream fs = new FileInputStream(filepath);
		Workbook wb = Workbook.getWorkbook(fs);
		// OR as below
		//Workbook wb = Workbook.getWorkbook(new FileInputStream("F:\\study material\\JAVA by KIRAN\\selenium1\\testdata1.xls"));

	}

}
