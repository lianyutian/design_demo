package com.github.lianyutian.design.solid.lsp.lsp01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 13:33
 */
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
