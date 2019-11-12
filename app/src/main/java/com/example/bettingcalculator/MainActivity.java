package com.example.bettingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bettingcalculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateReturn(View view){
        //Get numbers
        final EditText Odds1 = (EditText) findViewById(R.id.odds1);
        final EditText Odds2 = (EditText) findViewById(R.id.odds2);
        final EditText Odds3 = (EditText) findViewById(R.id.odds3);
        final EditText Stake = (EditText) findViewById(R.id.stakeText);

        //Set results
        final TextView result1 = (TextView) findViewById(R.id.netProfitText1);
        final TextView result2 = (TextView) findViewById(R.id.textView7);
        final TextView result3 = (TextView) findViewById(R.id.textView9);

        Button button = (Button) findViewById(R.id.button);



                double num1 = Double.parseDouble(Odds1.getText().toString());
                double num2 = Double.parseDouble(Odds2.getText().toString());
                double num3 = Double.parseDouble(Odds3.getText().toString());
                double stake = Double.parseDouble(Stake.getText().toString());

                double res = (stake/(num1 + num2 + num3));
                double res1 = res * num1;
                double res2 = res * num2;
                double res3 = res * num3;

                result1.setText(Double.toString(res1));
                result2.setText(Double.toString(res2));
                result3.setText(Double.toString(res3));



    }
}
