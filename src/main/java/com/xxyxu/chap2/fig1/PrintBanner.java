package com.xxyxu.chap2.fig1;

/**
 * Adapter（適合する側）クラス.<br>
 * Adapteeのメソッドを使ってTargetを満たす.<br>
 * クラスによるAdapterパターンの場合: 「継承」を使用してAdapteeを利用する.<br>
 * インスタンスによるAdapterパターンの場合: 「委譲」を使用してAdapteeを利用する.
 * @author xxyxu
 *
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
