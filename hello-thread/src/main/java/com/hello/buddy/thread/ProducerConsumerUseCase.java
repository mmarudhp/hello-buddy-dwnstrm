package com.hello.buddy.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.sleep;

class Producer implements Runnable {

    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("Starts producing ... ");
        for (int loop = 0; loop < 50; loop++) {
            try {
                queue.put(Integer.valueOf(loop));
                System.out.println("Write .. " + loop);
                if (loop % 10 == 0) {
                    System.out.println("Wait for 2 seconds .... ");
                    sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stop producing .... ");
    }
}

class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("Starts consuming ... ");
        try {
            while (true) {
                System.out.println("consume .... " + queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stop consuming .... ");
    }
}

public class ProducerConsumerUseCase {

    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
