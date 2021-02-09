package com.example.alpha.helper;

import java.util.Random;

public class Util {

    public float Acak(){
        Random r = new Random();
        int low = 100;
        int high = 1000;
        int result = r.nextInt(high-low) + low;
        float hasil = (float)result;
        return hasil;

    }

    public Integer Acak100(){
        Random r = new Random();
        int low = 50;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return result;

    }

}
