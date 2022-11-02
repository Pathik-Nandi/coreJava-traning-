package com.tarento.Primeusingexecutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prime implements Runnable {
    private Integer lowerLimit;
    private Integer upperlimit;

    public prime(Integer lowerLimit, Integer upperlimit) {
        this.lowerLimit = lowerLimit;
        this.upperlimit = upperlimit;
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i=lowerLimit;i<upperlimit;i++){
            if(isPrime(i)){
//                System.out.println(i);
                list.add(i);
//                System.out.println("Thread- "+Thread.currentThread().getName());
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    private boolean isPrime(int value){
        if (value<=1){
            return false;
        }else {
            for (int i=2;i<value/2;i++)
            {
                if(value%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
