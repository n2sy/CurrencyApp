package nidhal.tp1.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton r1;
    private RadioButton r2;
    private EditText txtSrc;
    private TextView txtOut;
//    private Button btn;


    private double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.r1 = findViewById(R.id.radioDinarEuro);
        this.txtSrc = (EditText) findViewById(R.id.montant);
        this.txtOut = (TextView) findViewById(R.id.Result);
        this.r2 = (RadioButton) findViewById(R.id.radioEuroDinar);
//        this.btn = (Button) findViewById(R.id.btnC);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                fctConvert(v);
//            }
//        });



    }

    public void fctConvert(View v)
    {

        if(r1.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) / 3.4;
            //txtOut.setText(res + " euros");
            txtOut.setText(getString(R.string.resultat, res, " euros !"));
            //txtOut.setText(getString(R.string.res_euros, res))
        }
        else if(r2.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) * 3.4;
            //txtOut.setText(res + " Dinars");
            txtOut.setText(getString(R.string.resultat, res, " dinars"));

        }
        else {
            Toast.makeText(getApplicationContext(), "Veuillez choisir une conversion", Toast.LENGTH_LONG).show();
        }

    }

}

