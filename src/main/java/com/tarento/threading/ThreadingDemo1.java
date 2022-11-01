package com.tarento.threading;

public class ThreadingDemo1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t2 = new Thread2();
        t2.start();

        Thread3 t3 = new Thread3();
        t3.start();
    }
}

class Thread1 extends Thread
{
    public  void run()
    {
        long starttime= System.currentTimeMillis();
        for (int i=0;i<=100;i++) {
            try {
                sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println(Thread.currentThread().getName()+":"+starttime);
        System.out.println("----------------------------------------\n");
    }
}
class Thread2 extends Thread {
    public void run() {
        long starttime = System.currentTimeMillis();
        String str = "PirateOfTarentoExecutorService";
        str = str.toLowerCase();
        int count = 0;
        try {
            sleep(1000);
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

        System.out.println("Total no of vowels in string are: " + count);
        System.out.println(Thread.currentThread().getName()+""+starttime);
        System.out.println("----------------------------------------\n");
    }
}
class Thread3 extends Thread
{
    public  void run()
    {
        long starttime= System.currentTimeMillis();
        for (int i=500;i>=100;i--) {
            try {
                sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println(Thread.currentThread().getName()+":"+starttime);
        System.out.println("----------------------------------------\n");
    }
}