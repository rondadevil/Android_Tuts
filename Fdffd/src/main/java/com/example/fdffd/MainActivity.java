package com.example.fdffd;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button r, s;
    TextView t;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        r = (Button) findViewById(R.id.b1);
        s=(Button) findViewById(R.id.b2);
        t = (TextView) findViewById(R.id.textView);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                t.setText("Your Total is "+counter);

            }
        });
       s.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               counter--;
               t.setText("Your total is "+counter);
           }
       });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
