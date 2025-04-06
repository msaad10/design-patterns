package com.learning.design.patterns.impl;

import com.learning.design.patterns.interfaces.HtmlReport;
import com.learning.design.patterns.interfaces.PdfReport;

import java.sql.Connection;

public class PdfReportImpl implements PdfReport {
    @Override
    public void generatePdfReport(String tableName) {
        System.out.println("Generating PDF report for table: " + tableName);
    }
}
