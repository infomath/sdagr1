package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Random;

/**
 * Created by klb on 31.07.17.
 */


public class Consumer implements Runnable {
    private Queue<Integer> queue;

    private final static Random rand = new Random();

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while(true) {
            try {
                Integer product = queue.remove();
                System.out.println("Konsument pobral " + product);
                Thread.sleep(100 + rand.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch(NoSuchElementException e) {
                System.out.println("Kolejka jest pusta wiec nie mozna pobrac elementu");
            }
        }
    }
}
