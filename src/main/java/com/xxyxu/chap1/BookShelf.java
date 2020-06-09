package com.xxyxu.chap1;

import java.util.ArrayList;

/**
 * ConcreteAggregate（具体的な集合体）クラス<br>
 * Aggregateが定めたIF（API）を実際に実装する.<br>
 * 具体的なIterator、即ちConcreteIteratorのインスタンスを作り出す.
 * @author xxyxu
 *
 */
public class BookShelf implements Aggregate {
    private ArrayList books;

    public BookShelf(int initialisize) {
        this.books = new ArrayList(initialisize);
    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
