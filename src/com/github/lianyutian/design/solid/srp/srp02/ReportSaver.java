package com.github.lianyutian.design.solid.srp.srp02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 11:07
 */
public class ReportSaver {
    void saveToFile(Report report) {
        System.out.println("Saving report to file: " + report.content);
        // 保存报告到文件的其他逻辑...
    }
}
