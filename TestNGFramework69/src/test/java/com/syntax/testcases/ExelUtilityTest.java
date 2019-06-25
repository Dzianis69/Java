package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class ExelUtilityTest {
@Test
public void exelTest() {
	ExcelUtility obj = new ExcelUtility();
	obj.openExcel(Constants.XL_FILEPATH, "EmployeeDetails");
//	String value = obj.getCellData(4, 3);
//	System.out.println(value);
	
	int row = obj.getRowNum();
	int col = obj.getColNum(1);
	
	Object [][] data = new Object[row][col];
	
	
	for(int i = 1;i < row;i++) {
		for(int j = 0; j < col; j++) {
			
			String value = obj.getCellData(i, j);
			data[i][j] = value;
		}
		System.out.println(data);
	}
	
}
}
