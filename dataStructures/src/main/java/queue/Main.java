package queue;

import bst.BST;
import bst.BSTImpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by klb on 31.07.17.
 */
public class Main {

    public static void main(String[] args) {

        BST<String> bst = new BSTImpl<>();
        bst.add("bcde");
        bst.add("aaa");
        bst.add("abc");
        bst.add("ggg");
        bst.add("cef");
        bst.add("cef");
        System.out.println(bst.show());


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(8);
        pq.add(11);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
//        Queue<Integer> queue  = new LinkedList<Integer>();
//        Producer prod = new Producer(queue);
//        Consumer cons = new Consumer(queue);
//        Thread prodThread = new Thread(prod);
//        Thread consThread = new Thread(cons);
//        prodThread.start();
//        consThread.start();

    }
}
