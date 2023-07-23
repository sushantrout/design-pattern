package com.tech;

import java.sql.Connection;

public class HtmlReportImpl implements HtmlReport {
 
	@Override
	public void generateHtmlReport(Connection connection, String tableName) {
		System.out.println("HTML report generation logic is here..");
	}
 
}