package application;

import dataStructures.ListDoubleE.ListDouble;
import dataStructures.ListSingleE.ListSingle;
import dataStructures.queue.FIFO;
import dataStructures.queue.LIFO;
import dataStructures.stack.Stack;
import fibonacci.*;
import othersAlgorithms.*;
import othersAlgorithms.BackupSystem.*;

import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
//        ListSingleE();
//        ListDoubleE();
//        FIFO();
//        LIFO();
//        stack();

        MapDs();

//        fibonacci();
//        fibonacciRecursive();
//        fibonacciDP();

//        chessQueens();
//        backupSystem();
//        subConjuntosBackTracking();
//        troco();
//        workBooks();


    }



    private static void workBooks() {
    }

    private static void troco() {
        Troco troco = new Troco();

        System.out.println("Change is 18:");
        troco.solution(18, new int[]{5, 2, 1});

        System.out.println("Change is 20:");
        troco.solution(20, new int[]{5, 2, 1});

        System.out.println("Change is 13:");
        troco.solution(13, new int[]{5, 2, 1});

        System.out.println("Change is 11:");
        troco.solution(11, new int[]{5, 2, 1});

        System.out.println("Change is 17:");
        troco.solution(17, new int[]{5, 2, 1});

        System.out.println("Change is 19:");
        troco.solution(19, new int[]{5, 2, 1});

        System.out.println("Change is 27:");
        troco.solution(27, new int[]{5, 2, 1});

        System.out.println("Change is 12:");
        troco.solution(12, new int[]{5, 3, 1});
    }

    private static void subConjuntosBackTracking() {
        SubConjuntosBackTracking subConjuntosBackTracking = new SubConjuntosBackTracking();
        System.out.println("Input: [] , n = 1\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{}, 1) + "\n");
        System.out.println("Input: [1,2,3] , n = 0\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3}, 0) + "\n");
        System.out.println("Input: [1,2,3] , n = 1\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3}, 1) + "\n");
        System.out.println("Input: [1,2,3] , n = 2\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3}, 2) + "\n");
        System.out.println("Input: [1,2,3,4,5,6,7,8,9,10] , n = 2\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3,4,5,6,7,8,9,10}, 2) + "\n");
        System.out.println("Input: [1,2,3,4,5,6,7,8,9,10] , n = 3\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3,4,5,6,7,8,9,10}, 3) + "\n");
        System.out.println("Input: [1,2,3,4,5,6,7,8,9,10] , n = 4\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3,4,5,6,7,8,9,10}, 4) + "\n");
        System.out.println("Input: [1,2,3,4,5,6,7,8,9,10] , n = 5\n" + "Output: " + subConjuntosBackTracking.getSubConjuntos(new int[]{1,2,3,4,5,6,7,8,9,10}, 5) + "\n");
    }
    private static void backupSystem() {
        BackupSystem backupSystem = new BackupSystem();
        Batch batch = new NewBatch(new int[]{70, 10, 20, 40, 50, 60, 50, 100, 100});
        System.out.println("should be 6: " + backupSystem.getMinimumTapeCount(batch));

        Batch batch2 = new NewBatch(new int[]{70, 10, 20});
        System.out.println("should be 2: " + backupSystem.getMinimumTapeCount(batch2));

        Batch batch3 = new NewBatch(new int[]{70, 30});
        System.out.println("should be 1: " + backupSystem.getMinimumTapeCount(batch3));

        Batch batch4 = new NewBatch(new int[]{70, 10, 20, 30});
        System.out.println("should be 2: " + backupSystem.getMinimumTapeCount(batch4));
    }
    private static void chessQueens() {
        ChessQueens chessQueens = new ChessQueens();

        class QuestionList {
            private int[][] board;
            private int queens;

            public QuestionList(int[][] board, int queens) {
                this.board = board;
                this.queens = queens;
            }

            public int[][] getBoard() {
                return board;
            }

            public int getQueens() {
                return queens;
            }
        }

        ArrayList<QuestionList> inputsArray = new ArrayList<>();
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}, 4));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 5));

        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}, 5));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}, 6));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}, 7));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}, 8));

        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}}, 5));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}}, 6));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}, {0,0,0,0,0,0,0}}, 7));
        inputsArray.add(new QuestionList(new int[][]{{0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}}, 8));

        for (QuestionList question : inputsArray) {
            if (chessQueens.solution(question.getBoard(), question.getQueens())) {
                chessQueens.getSuccessAnswer();
            } else chessQueens.getFailedAnswer();
        }
    }

    private static void fibonacciDP() {
        System.out.println(FibonacciDP.getElement(12));
    }
    private static void fibonacciRecursive() {
        System.out.println(new FibonacciRecursive().getElement(11));
    }
    private static void fibonacci() {
        System.out.println(new Fibonacci().getElement(10));
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
