package com.example.justinseo.assignment3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

import static android.content.Context.SENSOR_SERVICE;

/**
 * Created by justinseo on 12/1/17.
 */

public class MyServiceTask implements Runnable {

    static boolean running;
    private Context context;

    public MyServiceTask(Context _context) {
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        context = _context;
    }

    @Override
    public void run() {
        running = true;
        while(running){
        }
    }

    public void stopProcessing() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(running);
        running = false;
    }

}
