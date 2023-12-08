package com.github.lianyutian.design.solid.srp.srp02;

/**
 * 采用单一职责原则的例子
 *
 * @author liming
 * @version 1.0
 * @since 2023/12/8 11:06
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
}
