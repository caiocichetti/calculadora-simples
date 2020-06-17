package com.example.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Avatares
    LinearLayout llPrincipal;
    LinearLayout llHorizontal;
    EditText etv1, etv2;
    Button btMais, btMenos, btVezes, btDividido, btCancela;
    TextView tvValor1, tvValor2, tvIgual, tvResultado, tvInvisivel1, tvInvisivel2, tvInvisivel3, tvInvisivel4;
    Modelo M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M = new Modelo();

        // Associar
        llPrincipal = (LinearLayout)findViewById(R.id.layout_principal);
        llHorizontal = (LinearLayout)findViewById(R.id.layout_horiprincipal);
        etv1 = (EditText)findViewById(R.id.etValor1);
        etv2 = (EditText)findViewById(R.id.etValor2);
        btMais = (Button) findViewById(R.id.btMais);
        btMenos = (Button) findViewById(R.id.btMenos);
        btVezes = (Button) findViewById(R.id.btVezes);
        btDividido = (Button) findViewById(R.id.btDividido);
        btCancela = (Button) findViewById(R.id.btCancel);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        // Definir os eventos que vai escutar
        btMais.setOnClickListener(this);
        btMenos.setOnClickListener(this);
        btVezes.setOnClickListener(this);
        btDividido.setOnClickListener(this);
        btCancela.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // if (v instanceof Button) { }

        String operador = ((Button)v).getText().toString();

        if(operador.contains("C"))
        {
            etv1.setText("");
            etv2.setText("");
            tvResultado.setText(M.getUltimaOperacao());
        } else {
            double op1;
            double op2;

            try {
                op1 = Double.parseDouble(etv1.getText().toString());
            } catch (Exception e) {
                op1 = 0;
                Log.i("Caio", e.getMessage());
            }

            try {
                op2 = Double.parseDouble(etv2.getText().toString());
            } catch (Exception e) {
                op2 = 0;
                Log.i("Caio", e.getMessage());
            }

             double result = M.Calcula(operador, op1, op2);
            tvResultado.setText(String.valueOf(result));
        }
    }
}
