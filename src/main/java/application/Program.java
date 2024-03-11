package application;

import dataStructures.ListDoubleE.ListDouble;
import dataStructures.ListSingleE.ListSingle;
import dataStructures.queue.FIFO;
import dataStructures.queue.LIFO;
import dataStructures.stack.Stack;

public class Program {

    public static void main(String[] args) {
//        ListSingleE();
//        ListDoubleE();
//        FIFO();
//        LIFO();
//        stack();
        MapDs();
    }

    private static void ListSingleE() {
        ListSingle<Integer> list = new ListSingle<>();

        // PUSH TEST
        list.push(2);
        list.push(7);
        list.push(9);
        System.out.println("List size 3 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 9 = " + list.getLastValue());
        System.out.println("El at 1 is 2 = " + list.elementAt(1));
        System.out.println("El at 2 is 7 = " + list.elementAt(2));
        System.out.println("El at 3 is 9 = " + list.elementAt(3));
        System.out.println("list [ 2, 7, 9 ]");
        list.printList();

        // POP TEST
        Integer num = list.pop();
        System.out.println("num is 9 = " + num);
        System.out.println("List size 2 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 7 = " + list.getLastValue());
        System.out.println("El at 1 is 2 = " + list.elementAt(1));
        System.out.println("El at 2 is 7 = " + list.elementAt(2));
        System.out.println("El at 3 is null = " + list.elementAt(3));
        System.out.println("list [ 2, 7 ]");
        list.printList();

        num = list.pop();
        System.out.println("num is 7 = " + num);
        System.out.println("List size 1 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 2 = " + list.getLastValue());
        System.out.println("list [ 2 ]");
        list.printList();

        num = list.pop();
        System.out.println("num is 2 = " + num);
        System.out.println("List size 0 = " + list.getSize());
        System.out.println("List first value null = " + list.getFirstValue());
        System.out.println("List last value mull = " + list.getLastValue());
        System.out.println("list [ ]");
        list.printList();

        list.push(2);
        list.push(7);
        list.push(9);
        list.push(10);
        list.push(1);
        list.push(4);

        System.out.println("list [ 2, 7, 9, 10, 1, 4 ]");
        list.printList();
        System.out.println("El at 4 is 10 = " + list.elementAt(4));
        System.out.println("El at 5 is 1 = " + list.elementAt(5));
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 4 = " + list.getLastValue());

        // insertAt TEST

        list.insert(144, 3);
        System.out.println("El at 3 is 144 = " + list.elementAt(3));

        list.insert(121, 1);
        System.out.println("El at 1 is 121 = " + list.elementAt(1));

        list.insert(39, 8);
        System.out.println("El at 8 is 39 = " + list.elementAt(8));

        list.insert(101010, 10);
        System.out.println("El at 10 is 101010 = " + list.elementAt(10));

        System.out.println("List first value 121 = " + list.getFirstValue());
        System.out.println("List last value 101010 = " + list.getLastValue());
        System.out.println();

        // remove TEST
        list.remove( 30);
        System.out.println("List size 10 = " + list.getSize());
        list.printList();


        list.remove( 3);
        System.out.println("List size 9 = " + list.getSize());
        list.printList();

        list.remove( 1);
        System.out.println("List size 8 = " + list.getSize());
        list.printList();

        list.remove( 8);
        System.out.println("List size 7 = " + list.getSize());
        list.printList();

        list.remove( 6);
        System.out.println("List size 6 = " + list.getSize());
        list.printList();
    }
    private static void ListDoubleE() {
        ListDouble<Integer> list = new ListDouble<>();

        // PUSH TEST
        list.push(2);
        list.push(7);
        list.push(9);
        System.out.println("List size 3 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 9 = " + list.getLastValue());
        System.out.println("El at 1 is 2 = " + list.elementAt(1));
        System.out.println("El at 2 is 7 = " + list.elementAt(2));
        System.out.println("El at 3 is 9 = " + list.elementAt(3));
        System.out.println("list [ 2, 7, 9 ]");
        list.printList();

        // POP TEST
        Integer num = list.pop();
        System.out.println("num is 9 = " + num);
        System.out.println("List size 2 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 7 = " + list.getLastValue());
        System.out.println("El at 1 is 2 = " + list.elementAt(1));
        System.out.println("El at 2 is 7 = " + list.elementAt(2));
        System.out.println("El at 3 is null = " + list.elementAt(3));
        System.out.println("list [ 2, 7 ]");
        list.printList();

        num = list.pop();
        System.out.println("num is 7 = " + num);
        System.out.println("List size 1 = " + list.getSize());
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 2 = " + list.getLastValue());
        System.out.println("list [ 2 ]");
        list.printList();

        num = list.pop();
        System.out.println("num is 2 = " + num);
        System.out.println("List size 0 = " + list.getSize());
        System.out.println("List first value null = " + list.getFirstValue());
        System.out.println("List last value mull = " + list.getLastValue());
        System.out.println("list [ ]");
        list.printList();

        list.push(2);
        list.push(7);
        list.push(9);
        list.push(10);
        list.push(1);
        list.push(4);

        System.out.println("list [ 2, 7, 9, 10, 1, 4 ]");
        list.printList();
        System.out.println("El at 4 is 10 = " + list.elementAt(4));
        System.out.println("El at 5 is 1 = " + list.elementAt(5));
        System.out.println("List first value 2 = " + list.getFirstValue());
        System.out.println("List last value 4 = " + list.getLastValue());

        // insertAt TEST

        list.insert(144, 3);
        System.out.println("El at 3 is 144 = " + list.elementAt(3));

        list.insert(121, 1);
        System.out.println("El at 1 is 121 = " + list.elementAt(1));

        list.insert(39, 8);
        System.out.println("El at 8 is 39 = " + list.elementAt(8));

        list.insert(101010, 10);
        System.out.println("El at 10 is 101010 = " + list.elementAt(10));

        System.out.println("List first value 121 = " + list.getFirstValue());
        System.out.println("List last value 101010 = " + list.getLastValue());
        System.out.println();

        // remove TEST
        list.remove( 30);
        System.out.println("List size 10 = " + list.getSize());
        list.printList();


        list.remove( 3);
        System.out.println("List size 9 = " + list.getSize());
        list.printList();

        list.remove( 1);
        System.out.println("List size 8 = " + list.getSize());
        list.printList();

        list.remove( 8);
        System.out.println("List size 7 = " + list.getSize());
        list.printList();

        list.remove( 6);
        System.out.println("List size 6 = " + list.getSize());
        list.printList();
    }

    private static void FIFO() {
        FIFO<String> queue = new FIFO<>();

        System.out.println("Empty (True): " + queue.isEmpty());
        System.out.println("First (Null): " + queue.front());
        System.out.println("Last (Null): " + queue.rear());
        System.out.println("Size (0): " + queue.getSize());
        System.out.println();

        queue.enqueue("José");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (José): " + queue.rear());
        System.out.println("Size (1): " + queue.getSize());
        System.out.println();

        queue.enqueue("Maria");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Maria): " + queue.rear());
        System.out.println("Size (2): " + queue.getSize());
        System.out.println();

        queue.enqueue("João");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (João): " + queue.rear());
        System.out.println("Size (3): " + queue.getSize());
        System.out.println();

        queue.enqueue("Mariana");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Mariana): " + queue.rear());
        System.out.println("Size (4): " + queue.getSize());
        System.out.println();

        queue.enqueue("Pedro");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (5): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (Maria): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (4): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (João): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (3): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (Mariana): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (2): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (Pedro): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (1): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (True): " + queue.isEmpty());
        System.out.println("First (Null): " + queue.front());
        System.out.println("Last (Null): " + queue.rear());
        System.out.println("Size (0): " + queue.getSize());
        System.out.println();
    }
    private static void LIFO() {
        LIFO<String> queue = new LIFO<>();

        System.out.println("Empty (True): " + queue.isEmpty());
        System.out.println("First (Null): " + queue.front());
        System.out.println("Last (Null): " + queue.rear());
        System.out.println("Size (0): " + queue.getSize());
        System.out.println();

        queue.enqueue("José");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (José): " + queue.rear());
        System.out.println("Size (1): " + queue.getSize());
        System.out.println();

        queue.enqueue("Maria");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Maria): " + queue.rear());
        System.out.println("Size (2): " + queue.getSize());
        System.out.println();

        queue.enqueue("João");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (João): " + queue.rear());
        System.out.println("Size (3): " + queue.getSize());
        System.out.println();

        queue.enqueue("Mariana");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Mariana): " + queue.rear());
        System.out.println("Size (4): " + queue.getSize());
        System.out.println();

        queue.enqueue("Pedro");
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Pedro): " + queue.rear());
        System.out.println("Size (5): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Mariana): " + queue.rear());
        System.out.println("Size (4): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (João): " + queue.rear());
        System.out.println("Size (3): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (Maria): " + queue.rear());
        System.out.println("Size (2): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (False): " + queue.isEmpty());
        System.out.println("First (José): " + queue.front());
        System.out.println("Last (José): " + queue.rear());
        System.out.println("Size (1): " + queue.getSize());
        System.out.println();

        queue.dequeue();
        System.out.println("Empty (True): " + queue.isEmpty());
        System.out.println("First (Null): " + queue.front());
        System.out.println("Last (Null): " + queue.rear());
        System.out.println("Size (0): " + queue.getSize());
        System.out.println();
    }

    private static void stack() {
        Stack<Character> stack = new Stack<>();

        System.out.println("Empty (True): " + stack.isEmpty());
        System.out.println("Top (Null): " + stack.top());
        System.out.println("Size (0): " + stack.getSize());
        System.out.println();

        stack.push('A');
        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("First (A): " + stack.top().toString());
        System.out.println("Size (1): " + stack.getSize());
        System.out.println();

        stack.push('B');
        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("First (B): " + stack.top().toString());
        System.out.println("Size (2): " + stack.getSize());
        System.out.println();

        stack.push('C');
        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("First (C): " + stack.top().toString());
        System.out.println("Size (3): " + stack.getSize());
        System.out.println();

        stack.push('D');
        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("First (D): " + stack.top().toString());
        System.out.println("Size (4): " + stack.getSize());
        System.out.println();

        stack.push('E');
        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("First (E): " + stack.top().toString());
        System.out.println("Size (5): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("POP (E): " + stack.pop().toString());
        System.out.println("First (D): " + stack.top().toString());
        System.out.println("Size (4): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("POP (D): " + stack.pop().toString());
        System.out.println("First (C): " + stack.top().toString());
        System.out.println("Size (3): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("POP (C): " + stack.pop().toString());
        System.out.println("First (B): " + stack.top().toString());
        System.out.println("Size (2): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("POP (B): " + stack.pop().toString());
        System.out.println("First (A): " + stack.top().toString());
        System.out.println("Size (1): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (False): " + stack.isEmpty());
        System.out.println("POP (A): " + stack.pop().toString());
        System.out.println("First (null): " + stack.top());
        System.out.println("Size (0): " + stack.getSize());
        System.out.println();

        System.out.println("Empty (true): " + stack.isEmpty());
        System.out.println();
    }

    private static void MapDs() {}

}
