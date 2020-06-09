package com.xxyxu.chap2.fig1;

/**
 * Client（依頼者）クラス<br>
 * Targetのメソッドを使って仕事をする.
 * @author xxyxu
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 「PrintBannerクラスが多くのメソッドを持っていても、飽くまでPrintインタフェースのメソッドを利用している」<br>
         * という意図を強調するために、Print型に代入している。
         */
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
