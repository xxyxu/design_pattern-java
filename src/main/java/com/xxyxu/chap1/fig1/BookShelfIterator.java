package com.xxyxu.chap1.fig1;

/**
 * ConcreteIterator（具体的な反復子）クラス<br>
 * Iteratorが定めたIF（API）を実際に実装する.<br>
 * スキャンするために必要な情報を持っている必要がある.
 * @author xxyxu
 *
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
