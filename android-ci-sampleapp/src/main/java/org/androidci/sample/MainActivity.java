package org.androidci.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private final HelloWorldGenerator helloWorldGenerator = new HelloWorldGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int a = 0;
        setContentView(R.layout.activity_main);
        Button greetMeButton = (Button) findViewById(R.id.greateButton);
        greetMeButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView greetingsTextField = (TextView) findViewById(R.id.greetingsText);
                String helloWord = helloWorldGenerator.generateHelloWord();
                greetingsTextField.setText(helloWord);
            }
        });
        int unusedVar;
    }

}
