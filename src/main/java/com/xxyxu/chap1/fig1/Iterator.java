package com.xxyxu.chap1.fig1;

/**
 * Iterator（反復子）インタフェース<br>
 * 要素を順番にスキャンしていくIF（API）を定める.
 * @author xxyxu
 *
 */
public interface Iterator {
    /**
     * 次の要素が存在するかどうかを得る
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 次の要素を得る
     * @return
     */
    public abstract Object next();
}
