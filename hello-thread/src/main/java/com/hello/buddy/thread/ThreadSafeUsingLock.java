package com.hello.buddy.thread;

import java.sql.Timestamp;

public class ThreadSafeUsingLock implements Runnable {

    @Override
    public void run() {
        process();
    }

    private void process() {
        Timestamp start = new Timestamp(System.currentTimeMillis());
        System.out.println("Start Processing ... " + Thread.currentThread().getName() + " : " + start);
        synchronized (ThreadSafeUsingLock.class) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed Processing .. " + Thread.currentThread().getName() +
                    " @" + new Timestamp(System.currentTimeMillis()));
        }
    }

    public static void main(String[] args) {
        ThreadSafeUsingLock lockOnObject = new ThreadSafeUsingLock();
        Thread t1 = new Thread(lockOnObject);
        Thread t2 = new Thread(lockOnObject);
        ThreadSafeUsingLock lockOnObject2 = new ThreadSafeUsingLock();
        Thread t3 = new Thread(lockOnObject2);
        t1.start();
        t2.start();
        t3.start();
    }
}
