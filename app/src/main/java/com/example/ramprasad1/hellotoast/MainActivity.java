package com.example.ramprasad1.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView tv;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView)   findViewById(R.id.textView1);
    }

    public void toast(View view)
    {
        Toast.makeText(this,tv.getText().toString(),Toast.LENGTH_LONG).show();
    }

    public void btn2(View view)
    {
        count++;
        int d=count;
        tv.setText(Integer.toString(d));
    }
}
