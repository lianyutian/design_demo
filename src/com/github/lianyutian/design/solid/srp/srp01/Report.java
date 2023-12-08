package com.github.lianyutian.design.solid.srp.srp01;

/**
 * 违反单一职责原则的例子
 *
 * @author liming
 * @version 1.0
 * @since 2023/12/8 11:03
 */
public class Report {
    String content;

    Report(String content) {
        this.content = content;
    }

    void generateReport() {
        System.out.println("Generating report: " + content);
        // 生成报告的其他逻辑...
    }

    void saveToFile() {
        System.out.println("Saving report to file: " + content);
        // 保存报告到文件的其他逻辑...
    }
}
