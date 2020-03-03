package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        r=(TextView) findViewById(R.id.r);

    }

    public void handleEvent(View v) {
        float f=Float.parseFloat(n1.getText().toString());
        float s=Float.parseFloat(n2.getText().toString());
        float eq=0;
//        if(   ( (Float.toString(f)).equals('' ) ) || ( (Float.toString(s)).equals('')) )
//        {
//            f=0;
//            s=0;
//        }
        switch(v.getId()) {
            case R.id.add :
                eq=f+s;
                break;
            case R.id.sub :
                eq=f-s;
                break;
            case R.id.mul :
                eq=f*s;
                break;
            case R.id.div :
                eq=f/s;
                break;
        }
        r.setText(Float.toString(eq));
    }
}
