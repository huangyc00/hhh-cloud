package com.hyc.admin.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProvider {
    public static void main(String[] args) {
        BlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<>();
        Consumer consumer = new Consumer(blockingQueue);
        Provider provider = new Provider(blockingQueue);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){
                    try {
                        Thread.sleep(1000);
                        consumer.consume();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){
                    try {
                        Thread.sleep(500);
                        provider.product();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

}


class Consumer {

    private BlockingQueue<Object> blockingQueue;


    public Consumer(BlockingQueue<Object> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void consume() {
        synchronized (blockingQueue) {
            //当队列的数目为0时，代表无法消费，此时
            if (blockingQueue.size() == 0) {
                try {
                    System.out.println("消费者开始自闭");
                    blockingQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object object = blockingQueue.poll();
            System.out.println("c -> " + object.toString());
            blockingQueue.notifyAll();
        }
    }

}

class Provider {

    private BlockingQueue<Object> blockingQueue;

    public Provider(BlockingQueue<Object> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void product() {
        synchronized (blockingQueue) {
            if (30 <= blockingQueue.size()) {
                try {
                    System.out.println("生产者开始自闭");
                    blockingQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            blockingQueue.offer("hi");
            System.out.println("P ->" + blockingQueue.size());
            blockingQueue.notifyAll();
        }
    }

}