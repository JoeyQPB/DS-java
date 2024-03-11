package dataStructures.ListSingleE;

public class ListSingle<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private Integer size;

    public ListSingle() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    // remove the first el
    public E shift() {
        if (isEmpty()) return null;

        Node<E> pointer = this.firstNode;

        if ( pointer.getNext() == null )this.firstNode = null;
        else this.firstNode = pointer.getNext();

        this.size--;
        return pointer.getValue();
    }

    // add the first el
    public void unShift(E value) {
        Node<E> newNode = new Node<>(value, null);
        unShift(newNode);
        size++;
    }

    private void unShift(Node<E> newNode) {
        if (this.size.equals(0)){
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            newNode.setNext(this.firstNode);
            this.firstNode = newNode;
        }
    }

    public void push(E value) {
        Node<E> newNode = new Node<>(value, null);
        pushNode(newNode);
        size++;
    }

    // add Node in the end of the list
    private void pushNode(Node<E> newNode) {
        if (this.size.equals(0)){
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            Node<E> pointer;
            pointer = this.lastNode;
            this.lastNode = newNode;
            pointer.setNext(newNode);
        }
    }

    // remove and return the last node value on list
    public E pop() {
        if (isEmpty()) return null;
        Node<E> lastNode = this.lastNode;
        Node<E> previuosLastNode = getByIndex(this.size - 1);

        if (previuosLastNode == null) {
            this.lastNode = null;
            this.firstNode = null;
        } else {
            previuosLastNode.setNext(null);
            this.lastNode = previuosLastNode;
        }

        this.size--;
        return lastNode.getValue();
    }

    private E getByValue(E value) {
        Node<E> pointer = this.firstNode;

        for (int i = 1; i <= this.size; i++ ) {
            if (pointer.getValue().equals(value)) return pointer.getValue();
            else {
                pointer = pointer.getNext();
            }
        }
        return null;
    }

    // get node by index
    private Node<E> getByIndex(Integer index) {
        Node<E> pointer = this.firstNode;

        if (index == 0) return null;
        else {
            for (int i = 1; i < index; i++) {
                pointer = pointer.getNext();
            }
        }
        return pointer;
    }

    public E elementAt(Integer index) {
        if (isEmpty()) return null;
        Node<E> node = getByIndex(index);
        return (node != null) ? node.getValue() : null;
    }

    public void printList() {
        Node<E> pointer = this.firstNode;

        if (isEmpty()) {
            System.out.println("[ ]");
            return;
        }

        System.out.print("[ ");
        while (pointer.getNext() != null) {
            System.out.print(pointer.getValue() + ", ");
            pointer = pointer.getNext();
        }
        System.out.print(pointer.getValue() + " ]");
        System.out.println();
        System.out.println();
    }

    public void insert (E value, Integer index) {
        if (isEmpty()) return;

        Node<E> preiviousNode = getByIndex(index - 1);

        if (preiviousNode == null) {
            Node<E> nodePointer = this.firstNode;
            this.firstNode = new Node<>(value, nodePointer);
        } else if (index.equals(this.size+1)) {
            Node<E> newNode = new Node<>(value, null);
            this.lastNode.setNext(newNode);
            this.lastNode = newNode;
        } else {
            Node<E> newNode = new Node<>(value, preiviousNode.getNext());
            preiviousNode.setNext(newNode);
        }

        this.size++;
    }

    public void remove (Integer index) {
        if (isEmpty()) return;
        if (index > this.size) return;

        Node<E> preiviousNode = getByIndex(index - 1);

        if (preiviousNode == null && this.firstNode.getNext() == null) {
            this.firstNode = null;
            this.lastNode = null;
        } else if (preiviousNode == null) {
            Node<E> nodePointer = this.firstNode;
            this.firstNode = nodePointer.getNext();
        } else if (index.equals(this.size)) {
            preiviousNode.setNext(null);
            this.lastNode = preiviousNode;
        } else {
            Node<E> nodeToRemove = preiviousNode.getNext();
            preiviousNode.setNext(nodeToRemove.getNext());
        }
        this.size--;
    }

    public Integer getSize() {
        return this.size;
    }

    public E getFirstValue() {
        if (isEmpty()) return null;
        return firstNode.getValue();
    }

    public E getLastValue() {
        if (isEmpty()) return null;
        return lastNode.getValue();
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }
}
