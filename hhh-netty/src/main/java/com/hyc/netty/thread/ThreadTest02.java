package com.hyc.netty.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest02 {

    static Lock lock = new ReentrantLock();
    static ReentrantReadWriteLock wrLock = new ReentrantReadWriteLock();
    static Lock r = wrLock.readLock();
    static Lock w = wrLock.writeLock();

    static int number;

    private static int i = 0;

    private static ExecutorService executorService = Executors.newFixedThreadPool(100);

    private static ExecutorService executorServiceW = Executors.newFixedThreadPool(100);
    private static ExecutorService executorServiceR = Executors.newFixedThreadPool(10000);


    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            executorService.submit(new RunableTest01());
//        }
//        executorService.shutdown();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    try {
//                        Thread.sleep(1000);
//                        executorServiceR.execute(new ReadThead());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                executorServiceR.shutdown();
//            }
//        }).start();

        for (int i = 0; i < 10000; i++) {
            executorServiceR.execute(new ReadThead());
        }

        for (int i = 0; i < 100; i++) {
            executorServiceW.execute(new WriteThead());
        }


    }


    public static void write() throws InterruptedException {
        w.lock();
        try {
            //写操作需要2秒的处理时间
            Thread.sleep(2000);
            System.out.println("write：当前线程:" + Thread.currentThread().getName() + "；当前的number:" + ++number);

        } finally {
            w.unlock();
        }
    }

    public static void read() throws InterruptedException {
        r.lock();
        try {
            //读操作需要1秒的处理时间
            Thread.sleep(10000);
            System.out.println("read：当前线程:" + Thread.currentThread().getName() + "；当前的number:" + number);
        } finally {
            r.unlock();
        }
    }

    public static void lockTest() throws InterruptedException {
//        Boolean getLock = lock.tryLock(1000, TimeUnit.MILLISECONDS);
        Boolean getLock = lock.tryLock();
        if (!getLock) {
            System.out.println(Thread.currentThread().getName() + "这是没有获得锁");
            return;
        }
        try {
            while (true) {
                if (i == 999) {
                    Thread.sleep(10000);
                }
                if (i == 10000) {
                    break;
                }
                System.out.println("当前线程:" + Thread.currentThread().getName() + ";当前的i的值:" + i++);
            }
        } finally {
            lock.unlock();
        }
    }

    static class RunableTest01 implements Runnable {
        @Override
        public void run() {
            try {
                lockTest();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class WriteThead implements Runnable {

        @Override
        public void run() {
            try {
                write();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ReadThead implements Runnable {

        @Override
        public void run() {
            try {
                read();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
