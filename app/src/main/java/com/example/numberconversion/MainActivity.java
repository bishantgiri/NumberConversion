package com.example.numberconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText txt_number;
    TextView txt_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_number = (EditText)findViewById(R.id.txt_number);
        txt_result = (TextView) findViewById(R.id.txt_result);

    }

    public void convertText(View view){
        Integer number = Integer.parseInt(txt_number.getText().toString());

        String result = NumberConversion.convert(number);
        txt_result.setText(result);
    }
}
