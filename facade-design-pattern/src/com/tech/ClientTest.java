package com.tech;

import java.sql.Connection;

public class ClientTest {
 
	public static void main(String[] args) {
		
		Connection connection = null;
		String tableName = "employee_table";
		
		//Without Using Facade Pattern
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport(connection, tableName);
		
		HtmlReport htmlReport = new HtmlReportImpl();
		htmlReport.generateHtmlReport(connection, tableName);
		
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(connection, tableName);
		
		System.out.println("---------------------------------------------------");
		
		//With Using Facade Pattern
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generatePdfReport(connection, tableName);
		reportFacade.generateHtmlReport(connection, tableName);
		reportFacade.generateExcelReport(connection, tableName);
	}
 
}