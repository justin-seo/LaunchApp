package com.example.justinseo.assignment3;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    static int destroy = 0;
    static int create = 0;
    static TextView updateText;
    //final TextView timer = findViewById(R.id.timer);
    Button b_clear, b_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateText = findViewById(R.id.textUpdate);
        b_clear = findViewById(R.id.b_clear);
        b_exit = findViewById(R.id.b_exit);
        // Prevents the screen from dimming and going to sleep.
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                updateText.setText("NO MOVEMENT DETECTED");
                Toast.makeText(MainActivity.this, "Service created!", Toast.LENGTH_SHORT).show();
                System.out.println("ONCLICK CLEAR");
                create = 1;
                System.out.println("destroy "+destroy);
                System.out.println("create  "+create);
                System.out.println("DID THIS GET DESTROYED");
                stopService(new Intent(MainActivity.this, MyService.class));
                if(MyServiceTask.running==false){
                    System.out.println("DID THIS EVEN GET STARTED");
                    startService(new Intent(MainActivity.this, MyService.class));
                }
            }
        });

        b_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ONCLICK EXIT");
                create = 0;
                if(destroy==1){
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });
    }
}
