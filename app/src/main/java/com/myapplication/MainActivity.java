package com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (status) {
                    case 0:
                        btn.setBackgroundResource(R.color.colorPrimaryDark);
                        status = 1;
                        break;
                    case 1:
                        btn.setBackgroundResource(R.color.colorAccent);
                        status = 0;
                        break;
                }
            }
        });
    }
}
