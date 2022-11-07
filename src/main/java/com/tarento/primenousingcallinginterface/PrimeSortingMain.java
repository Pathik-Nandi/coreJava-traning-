package com.tarento.primenousingcallinginterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PrimeSortingMain {
    public static void main(String[] args) throws InterruptedException {
        int coreCount=Runtime.getRuntime().availableProcessors();
        long startTime = System.currentTimeMillis();
        ExecutorService executor=null;

        //List<Integer> list= new ArrayList<>();
        try {
            executor = Executors.newFixedThreadPool(coreCount);
            List<Future<List>> futures = new ArrayList<>();
            for (int i=0;i<500000;i+=1000){
                Future<List> future = executor.submit(new PrimeSortingCalling(i+1,i+1000));
                futures.add(future);
                //System.out.println(futures);

            }
            System.out.println(futures.size());

            System.out.println();
            List<List<Integer>> mainList = new ArrayList<>();
            for (Future<List> future: futures){
                List<Integer> result1= future.get();
                mainList.add(result1);
            }
            System.out.println(mainList);

        }catch (Exception e){
            e.printStackTrace();
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Time taken in milliseconds - " + (System.currentTimeMillis() - startTime));

    }
}
