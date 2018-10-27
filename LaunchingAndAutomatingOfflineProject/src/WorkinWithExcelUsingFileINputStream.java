import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class WorkinWithExcelUsingFileINputStream {
	public static void main(String[] args) throws Exception {
		// System.out.println(1);
		FileInputStream fis = new FileInputStream("F:\\study material\\JAVA by KIRAN\\selenium1\\testdata1.xls");
		// System.out.println(2);
		Workbook wrk = Workbook.getWorkbook(fis);
		// System.out.println(3);
		Sheet sh = wrk.getSheet(0);
		int rows = sh.getRows();
		 System.out.println(rows);
		int column = sh.getColumns();
		// System.out.println(column);
		for (int i = 0; i <= rows; i++) {
			 //System.out.println("i = " +i);

			for (int j = 1; j <= column; j++) {
				 //System.out.println("j= "+j);
				Cell cell = sh.getCell(i, j);
				System.out.println("row" +cell.getRow());
				//System.out.println("column " +cell.getColumn());
				//System.out.println(cell.getContents());
			}
		}
	}
}
