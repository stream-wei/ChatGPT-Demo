package com.stream;

public class PrimeTest {


    public boolean isPrime1(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return true;
            }
        }
        return false;
    }

}
