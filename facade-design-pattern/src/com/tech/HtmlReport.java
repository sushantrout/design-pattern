package com.tech;

import java.sql.Connection;

public interface HtmlReport {
 
	public abstract void generateHtmlReport(Connection connection,String tableName);
}