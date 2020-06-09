package com.xxyxu.chap1;

/**
 * Aggregate（集合体）クラス<br>
 * Iteratorが作り出すIF（API）を定める.<br>
 * 「持っている要素を順番にスキャンする存在」を作り出す.
 * @author xxyxu
 *
 */
public interface Aggregate {
    public abstract Iterator iterator();
}
