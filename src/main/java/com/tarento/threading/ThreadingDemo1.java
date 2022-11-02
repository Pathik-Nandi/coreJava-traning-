package com.tarento.threading;

import java.util.concurrent.CountDownLatch;

public class ThreadingDemo1 {
    public static void main(String[] args) throws InterruptedException {
        long startTime= System.currentTimeMillis();

        CountDownLatch latch = new CountDownLatch(3);

        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();

        Thread3 t3 = new Thread3();
        t3.start();
        latch.await();
        long stopTime= System.currentTimeMillis();
        long executionTime= startTime-stopTime;
        System.out.println("Total Execution Time:"+executionTime);
        int core=Runtime.getRuntime().availableProcessors();
        System.out.println("How many cores are used for this program:"+ core);

    }
}

class Thread1 extends Thread
{
    public  void run()
    {  int latch = 1;
        long startTime= System.currentTimeMillis();
        for (int i=0;i<=100;i++) {
            try {
                //sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        long stopTime= System.currentTimeMillis();
        long executionTime= startTime-stopTime;
        Thread.currentThread().setName("Thread-1");
        //latch.countDown();
        System.out.println("Total execution time for "+Thread.currentThread().getName()+":"+executionTime);
        System.out.println("----------------------------------------\n");
    }
}
class Thread2 extends Thread {
    public void run() {
        long startTime = System.currentTimeMillis();
        String str = "PirateOfTarentoExecutorService";
        str = str.toLowerCase();
        int count = 0;
        try {
            //sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;

            }
        }
        long stopTime= System.currentTimeMillis();
        long executionTime= startTime-stopTime;
        System.out.println("Total no of vowels in string are: " + count);
        Thread.currentThread().setName("Thread-2");
        //latch.countDown();
        System.out.println("Total Execution time: "+Thread.currentThread().getName()+":"+executionTime);
        System.out.println("----------------------------------------\n");
    }
}
class Thread3 extends Thread
{
    public  void run()
    {

        long startTime= System.currentTimeMillis();
        for (int i=500;i>=100;i--) {
            try {
                //sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        long stopTime= System.currentTimeMillis();
        long executionTime= startTime-stopTime;
        Thread.currentThread().setName("Thread-3");
        //latch.countDown();
        System.out.println("Total Execution Time: "+ Thread.currentThread().getName()+":"+executionTime);
        System.out.println("----------------------------------------\n");

    }
}