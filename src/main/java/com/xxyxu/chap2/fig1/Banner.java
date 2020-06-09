package com.xxyxu.chap2.fig1;

/**
 * Adaptee（適合される側）クラス<br>
 * 既に用意されているメソッドを持つ.<br>
 * AdapteeのメソッドがTargetのメソッドに一致している場合は、Adapterは不要.
 * @author xxyxu
 *
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}