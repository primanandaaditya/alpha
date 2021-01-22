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

}
