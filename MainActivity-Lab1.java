package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    MainActivity extends AppCompatActivity {

    int ch=1;
    float font=35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.textview);
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                t.setTextSize(font);
                font=font+5;
                if(font==45)
                    font=35;
            }
        });
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                switch (ch) {
                    case 1: {
                        t.setTextColor(Color.RED);
                        break;
                    }
                    case 2: {
                        t.setTextColor(Color.BLUE);
                        break;
                    }
                    case 3: {
                        t.setTextColor(Color.GREEN);
                        break;
                    }
                    case 4: {
                        t.setTextColor(Color.GRAY);
                        break;
                    }
                    case 5: {
                        t.setTextColor(Color.CYAN);
                        break;
                    }
                }
                ch++;
                if (ch == 6)
                    ch = 1;
            }
        });
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( t.getText() == "CSE")
                    t.setText("ISE");
                else
                    t.setText("CSE");
            }
        });

    }
}

