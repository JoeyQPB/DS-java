package dataStructures.ListDoubleE;

public class ListDouble<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private Integer size;

    public ListDouble() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public void push(E value) {
        Node<E> newNode = new Node<>(value);
        pushNode(newNode);
        size++;
    }

    // add Node in the end of the list
    private void pushNode(Node<E> newNode) {
        if (this.size.equals(0)) {
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            Node<E> pointer;
            pointer = this.lastNode;
            pointer.setNext(newNode);
            newNode.setPrevious(pointer);
            this.lastNode = newNode;
            newNode.setNext(null);
        }
    }

    // remove and return the last node value on list
    public E pop() {
        if (isEmpty()) return null;

        Node<E> pointer;
        pointer = this.lastNode.getPrevious();
        if (pointer == null) {
            pointer = this.lastNode;
            this.lastNode = null;
        } else {
            pointer.setNext(null);
            this.lastNode = pointer;
        }


        this.size--;
        return pointer.getValue();
    }

    public void insert (E value, Integer index) {
        Node<E> pointer;
        Node<E> newNode = new Node<>(value);

        if (index.equals(1)) {
            pointer = this.firstNode;
            newNode.setNext(pointer);
            pointer.setPrevious(newNode);
            this.firstNode = newNode;
        }

        if (!index.equals(1) && !index.equals(this.size) && !index.equals(this.size+1)) {
            if (isEmpty()) return;
            pointer = getByIndex(index);
            Node<E> nodePrevious = pointer.getPrevious();
            nodePrevious.setNext(newNode);
            newNode.setNext(pointer);
            pointer.setPrevious(newNode);
        }

        if (index.equals(this.size)) {
            pointer = this.lastNode;
            Node<E> previuosLastNode = pointer.getPrevious();

            previuosLastNode.setNext(newNode);
            newNode.setPrevious(previuosLastNode);

            pointer.setPrevious(newNode);
            newNode.setNext(pointer);
        }

        if (index.equals(this.size+1)) {
            pointer = this.lastNode;
            pointer.setNext(newNode);
            newNode.setPrevious(pointer);
            this.lastNode = newNode;
        }

        size++;
    }

    public void remove (Integer index) {
        if (isEmpty()) return;
        if (index > this.size) return;

        Node<E> pointer;

        if (index.equals(1) && this.firstNode.getNext() == null) {
            this.firstNode = null;
            this.lastNode = null;
        }
        if (index.equals(1)  && this.firstNode.getNext() != null) {
            pointer = this.firstNode;
            this.firstNode = pointer.getNext();
            this.firstNode.setPrevious(null);
        }

        if (!index.equals(1) && !index.equals(this.size)) {
            if (isEmpty()) return;
            pointer = getByIndex(index);
            Node<E> nodePrevious = pointer.getPrevious();
            Node<E> nodeNext = pointer.getNext();

            nodePrevious.setNext(nodeNext);
            nodeNext.setPrevious(nodePrevious);
        }

        if (index.equals(this.size)) {
            pointer = this.lastNode;
            this.lastNode = pointer.getPrevious();
            this.lastNode.setNext(null);
        }

        size--;
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
