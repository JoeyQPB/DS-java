package dataStructures.stack;

import dataStructures.ListSingleE.ListSingle;

public class Stack<E> {

    private final ListSingle<E> list;

    public Stack() {
        list = new ListSingle<>();
    }

    // add on top
    public void push(E value) {
        this.list.unShift(value);
    }

    // remove the top el
    public E pop() {
        return this.list.shift();
    }

    // return the top value
    public E top() {
        return this.list.getFirstValue();
    }

    public Boolean isEmpty() {
        return this.list.isEmpty();
    }

    public Integer getSize() {
        return this.list.getSize();
    }
}
