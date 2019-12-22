package com.hyc.netty.thread;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

public class ThreadTest01 {

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws Exception{
//        futureTest();
//        futureTaskTest();
        completionServiceTest();
    }

    public static void futureTest() {
        Callable<String> callable1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                long oldTime = System.currentTimeMillis();
                Thread.sleep(10000);
                long newTime = System.currentTimeMillis();
                System.out.println("线程:" + Thread.currentThread().getName() + "共消耗时间：" + (newTime - oldTime));
                return "success";
            }
        };
        Future<String> future = executorService.submit(callable1);
//        try {
//            future.get(5000, TimeUnit.MILLISECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//            System.out.println("已经超时了");
//        }

        System.out.println("这是分割线:------------------------");

        System.out.println("现在的时间：" + System.currentTimeMillis());
        while (!future.isDone()) {
            System.out.println("还没执行完");
        }
        try {
            String result = future.get(0, TimeUnit.MILLISECONDS);
            System.out.println("如果这个输出在上面,则表明不阻塞当前线程");
            System.out.println("结果:" + result + ";现在的时间为:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }


    public static void futureTaskTest() {
        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "success";
            }
        });
        executorService.submit(task);
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void completionServiceTest() throws InterruptedException{
        CompletionService completionService = new ExecutorCompletionService(executorService);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            completionService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("线程:" + Thread.currentThread().getName() + "执行任务");
                    Thread.sleep(1000);
                    if (finalI == 1) {
                        throw new RuntimeException("线程" + Thread.currentThread().getName() + "出现故障了");
                    }
                    return "线程" + Thread.currentThread().getName();
                }
            });
        }
        for (int i = 0; i < 10; i++) {
            Future<String> future = completionService.take();
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
                continue;
            }
        }
        executorService.shutdown();
    }
}
