package com.learning.design.patterns.impl;

import com.learning.design.patterns.interfaces.HtmlReport;

import java.sql.Connection;

public class HtmlReportImpl implements HtmlReport {
    @Override
    public void generateHtmlReport(String tableName) {
        System.out.println("Generating Html report for table: " + tableName);
    }
}
