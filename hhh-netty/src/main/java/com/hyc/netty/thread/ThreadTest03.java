package com.hyc.netty.thread;

import java.util.concurrent.*;

public class ThreadTest03 {

    private static ExecutorService executorService = Executors.newFixedThreadPool(100);


    public static void main(String[] args) throws InterruptedException {
//        final CountDownLatch countDownLatch = new CountDownLatch(9);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("准备开始了,先进行阻塞");
//                try {
//                    countDownLatch.await();
//                    System.out.println("结束阻塞");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        System.out.println("先睡个5秒钟");
//        Thread.sleep(5000);
//        for (int i = 0; i < 9; i++) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("这是减少计数的");
//                    countDownLatch.countDown();
//                }
//            });
//        }
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new SemaphoreTest(semaphore));
        }
    }

    public static class SemaphoreTest implements Runnable {

        private Semaphore semaphore;

        public SemaphoreTest(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("执行任务");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            } finally {
                semaphore.release();
            }
        }
    }
}
