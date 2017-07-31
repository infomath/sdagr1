package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by klb on 31.07.17.
 */
public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<Integer>();
        Producer prod = new Producer(queue);
        Consumer cons = new Consumer(queue);
        Thread prodThread = new Thread(prod);
        Thread consThread = new Thread(cons);
        prodThread.start();
        consThread.start();

    }
}
