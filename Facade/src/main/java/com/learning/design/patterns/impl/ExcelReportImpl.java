package com.learning.design.patterns.impl;

import com.learning.design.patterns.interfaces.ExcelReport;

public class ExcelReportImpl implements ExcelReport {
    @Override
    public void generateExcelReport(String tableName) {
        System.out.println("Generating Excel report for table: " + tableName);
    }
}
