package com.learning.design.patterns;

import com.learning.design.patterns.impl.ExcelReportImpl;
import com.learning.design.patterns.impl.HtmlReportImpl;
import com.learning.design.patterns.impl.PdfReportImpl;
import com.learning.design.patterns.interfaces.ExcelReport;
import com.learning.design.patterns.interfaces.HtmlReport;
import com.learning.design.patterns.interfaces.PdfReport;

public class ReportFacade {
    private ExcelReport excelReport;
    private HtmlReport htmlReport;
    private PdfReport pdfReport;

    public ReportFacade() {
        pdfReport = new PdfReportImpl();
        excelReport = new ExcelReportImpl();
        htmlReport = new HtmlReportImpl();
    }

    public void generateExcelReport(String tableName) {
        excelReport.generateExcelReport(tableName);
    }

    public void generateHtmlReport(String tableName) {
        htmlReport.generateHtmlReport(tableName);
    }

    public void generatePdfReport(String tableName) {
        pdfReport.generatePdfReport(tableName);
    }
}
