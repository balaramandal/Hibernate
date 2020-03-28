package corepractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProcessing {
	
	public static Sheet getRowFromFile(String sheetName){
		try{
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\balaram.m\\Desktop\\jijoimage\\sample.xlsx"));
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			Sheet sheet = workBook.getSheet(sheetName);
			return sheet;
		}catch(Exception ex){
			throw null;
		}
	}
	
	public static List<List<String>> getDataFromRow(Sheet sheet){
		List<List<String>> list = new ArrayList<>();
		List<String> valueList = null;
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()){
			valueList = new ArrayList<>();
			Iterator<Cell> cellItr = rowIterator.next().cellIterator();
			while(cellItr.hasNext()){
				valueList.add(cellItr.next().toString());
			}
			list.add(valueList);
		}
		return list;
	}
	
	public static List<CountryInfo> setCountry(String sheetName){
		List<List<String>> list = getDataFromRow(getRowFromFile(sheetName));
		List<CountryInfo> ci = new ArrayList<CountryInfo>();
		for(int i=1;i<list.size();i++){
			CountryInfo c = new CountryInfo();
			c.setCountryName(list.get(1).get(1));
			c.setEmail(list.get(2).get(2));
			c.setMobile(list.get(3).get(3));
			c.setPWD(list.get(4).get(4));
			c.setUN(list.get(5).get(5));
			ci.add(c);
		}
		return ci;
	}
	
	
}
