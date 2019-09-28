package com.hyc.admin.thread;

import java.util.concurrent.*;

public class ThreadTest1 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    result += i;
                }
                return result;
            }
        });

        Thread computeThread = new Thread(futureTask);
        computeThread.start();

//        Thread otherThread = new Thread(() -> {
//            System.out.println("other task is running...");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        otherThread.start();
        System.out.println(futureTask.get());
        System.out.println("结束了吧");
    }

}
