package com.example.asrock.clickscounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView);
        quantityTextView.setText(""+number);
    }

    public void submitCount(View view) {
        count += 1;
        display(count);
    }
}
