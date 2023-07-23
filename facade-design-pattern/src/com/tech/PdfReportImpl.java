package com.tech;

import java.sql.Connection;

public class PdfReportImpl implements PdfReport {
 
	@Override
	public void generatePdfReport(Connection connection, String tableName) {
		System.out.println("PDF report generation logic is here..");
	}
}