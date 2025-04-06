package com.learning.design.patterns;

import com.learning.design.patterns.impl.ExcelReportImpl;
import com.learning.design.patterns.impl.HtmlReportImpl;
import com.learning.design.patterns.impl.PdfReportImpl;
import com.learning.design.patterns.interfaces.ExcelReport;
import com.learning.design.patterns.interfaces.HtmlReport;
import com.learning.design.patterns.interfaces.PdfReport;

public class FacadeClient {
    public static void main(String[] args) {
        String tableName = "employee_table";

        // Without using Facade
        PdfReport pdfReport = new PdfReportImpl();
        pdfReport.generatePdfReport(tableName);

        HtmlReport htmlReport = new HtmlReportImpl();
        htmlReport.generateHtmlReport(tableName);

        ExcelReport excelReport = new ExcelReportImpl();
        excelReport.generateExcelReport(tableName);

        System.out.println("---------------------------------");

        // Using Facade
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generateExcelReport(tableName);
        reportFacade.generateHtmlReport(tableName);
        reportFacade.generatePdfReport(tableName);
    }
}