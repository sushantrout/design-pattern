package com.tech;

import java.sql.Connection;

public class ReportFacade {
 
	private PdfReport pdfReport;
	private HtmlReport htmlReport;
	private ExcelReport excelReport;
 
	public ReportFacade() {
		pdfReport = new PdfReportImpl();
		htmlReport = new HtmlReportImpl();
		excelReport = new ExcelReportImpl();
	}
 
	public void generatePdfReport(Connection connection, String tableName) {
		pdfReport.generatePdfReport(connection, tableName);
	}
 
	public void generateHtmlReport(Connection connection, String tableName) {
		htmlReport.generateHtmlReport(connection, tableName);
	}
 
	public void generateExcelReport(Connection connection, String tableName) {
		excelReport.generateExcelReport(connection, tableName);
	}
}