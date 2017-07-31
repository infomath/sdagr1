package queue;

import java.util.Queue;
import java.util.Random;

/**
 * Created by klb on 31.07.17.
 */
public class Producer implements Runnable {
    private Queue<Integer> queue;

    private final static Random rand = new Random();

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while(true) {
            Integer product = rand.nextInt(199) + 1;
            System.out.println("Producent wyprodukowal " + product);
            queue.add(product);
            try {
                Thread.sleep(100 + rand.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
