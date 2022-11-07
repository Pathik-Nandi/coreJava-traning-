package com.tarento.primenousingcallinginterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PrimeSortingCalling implements Callable<List> {
    private Integer lowerLimit;
    private  Integer upperLimit;
    //private Integer index;

    public PrimeSortingCalling(Integer lowerLimit, Integer upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        //this.index=index;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> primeList= new ArrayList<>();
        int count=0;
        for (int i=lowerLimit;i<upperLimit;i++){
            if (isPrime(i)){
                primeList.add(i);
                count++;
            }

        }
//        System.out.println(count);
        return primeList;
    }
    private boolean isPrime(int value) {
        if (value<=1){
            return false;
        }else {
            for (int i=2;i<value/2;i++){
                if (value%i==0){
                    return false;
                }
            }
            return true;
        }
    }


}
