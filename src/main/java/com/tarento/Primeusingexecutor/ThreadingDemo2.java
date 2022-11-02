package com.tarento.Primeusingexecutor;

import com.tarento.Primeusingexecutor.prime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        int coreCount=Runtime.getRuntime().availableProcessors();
        long startTime= System.currentTimeMillis();
        ExecutorService executor=null;
        try{
            executor = Executors.newFixedThreadPool(coreCount);
            for (int i=0;i<50000; i+=1000)
            {
                executor.execute((new prime(i+1,i+1000)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(executor!=null){
                executor.shutdown();
                executor.awaitTermination(10, TimeUnit.SECONDS);
                System.out.println("Time taken in milliseconds -"+ (System.currentTimeMillis() -startTime));
            }
        }
    }
}
