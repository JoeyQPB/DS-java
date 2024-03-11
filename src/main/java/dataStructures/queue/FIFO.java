package dataStructures.queue;

import dataStructures.ListSingleE.ListSingle;

public class FIFO<E> {

    private final ListSingle<E> list;

    public FIFO() {
        list = new ListSingle<>();
    }

    // add el in the end
    public void enqueue(E value) {
        this.list.push(value);
    }

    // remove the first el
    public E dequeue() {
        return this.list.shift();
    }

    // return the last el
    public E rear() {
        return this.list.getLastValue();
    }

    // return the first el
    public E front() {
        return this.list.getFirstValue();
    }

    public Integer getSize() {
        return this.list.getSize();
    }

    public Boolean isEmpty() {
        return this.list.isEmpty();
    }

}
