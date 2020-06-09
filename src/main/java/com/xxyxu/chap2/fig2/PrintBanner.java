package com.xxyxu.chap2.fig2;

import com.xxyxu.chap2.fig1.Banner;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }

}
