package com.tech;

import java.sql.Connection;

public class ExcelReportImpl implements ExcelReport {
 
	@Override
	public void generateExcelReport(Connection connection, String tableName) {
		System.out.println("EXCEL report generation logic is here..");
	}
}