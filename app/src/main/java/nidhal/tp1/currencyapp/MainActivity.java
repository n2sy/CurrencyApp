package nidhal.tp1.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton r1;
    private RadioButton r2;
    private EditText txtSrc;
    private TextView txtOut;


    private double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.radioDinarEuro);
        this.txtSrc = (EditText) this.findViewById(R.id.montant);
        this.txtOut = (TextView) this.findViewById(R.id.Result);
        this.r2 = (RadioButton) this.findViewById(R.id.radioEuroDinar);

    }

    public void fctConvert(View v)
    {

        if(r1.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) / 3.4;
            txtOut.setText(res + " Euros");

        }
        else if(r2.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) * 3.4;
            txtOut.setText(res + " TND");

        }
        else {
            Toast.makeText(getApplicationContext(), "Veuillez choisir une conversion", Toast.LENGTH_LONG).show();
        }

    }

}

