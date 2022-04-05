package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText hi, mi, hf, mf;
    TextView rh, rm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hi = findViewById(R.id.hi);
        mi = findViewById(R.id.mi);
        hf = findViewById(R.id.hf);
        mf = findViewById(R.id.mf);
        rh = findViewById(R.id.rh);
        rm = findViewById(R.id.rm);

    }


    public void soma(View khkhkhh) {
        int hiN = Integer.parseInt(hi.getText().toString());
        int miN = Integer.parseInt(mi.getText().toString());
        int hiF = Integer.parseInt(hf.getText().toString());
        int miF = Integer.parseInt(mf.getText().toString());

        int resultH = hiN + hiF;
        int resultM = miN + miF;

        while (resultM > 59) {
            resultH++;
            resultM = resultM - 60;
        }
        rh.setText(resultH + "");
        rm.setText(resultM + "");


    }

    public void subs(View jsajsa) {
        int hiN = Integer.parseInt(hi.getText().toString());
        int miN = Integer.parseInt(mi.getText().toString());
        int hiF = Integer.parseInt(hf.getText().toString());
        int miF = Integer.parseInt(mf.getText().toString());

        int resultH = hiN - hiF;
        int resultM = miN - miF;

        while (resultM < 0) {
            resultH--;
            resultM = resultM + 60;
        }
        rh.setText(resultH + "");
        rm.setText(resultM + "");

    }


    public void resets(View ksks) {

        rh.setText("");
        rm.setText("");
        hi.setText("");
        mi.setText("");
        hf.setText("");
        mf.setText("");

    }
}