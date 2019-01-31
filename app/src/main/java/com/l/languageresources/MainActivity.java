package com.l.languageresources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                  //Detta är en casting som inte längre behövs för findViewById
        helloView =(TextView) findViewById(R.id.textView);

    }




    public void buttonPressed(View view) {
        //Första sättet
        String s = getString(R.string.good_bye);
        helloView.setText(s + "!!!");

        //Andra sättet
        //helloView.setText(R.string.good_bye);
    }
}
