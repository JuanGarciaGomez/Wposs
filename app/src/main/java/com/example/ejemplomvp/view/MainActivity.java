package com.example.ejemplomvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ejemplomvp.R;
import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.databinding.ActivityMainBinding;
import com.example.ejemplomvp.presenter.TipoPresenter;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity implements TipoInterface.View {

    private TipoInterface.Presenter presenter;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        presenter = new TipoPresenter(this);


    }
    public void numero(View view) {
        presenter.enviarNumero(Integer.parseInt(b.etNumero.getText().toString()));
    }

    public void sumar(View view) {
        presenter.suma(b.etNumero1.getText().toString(), b.etNumero2.getText().toString());
    }

    public void restar(View view) {
        presenter.resta(b.etNumero1.getText().toString(), b.etNumero2.getText().toString());
    }

    public void multiplicar(View view) {
        presenter.multiplicacion(b.etNumero1.getText().toString(), b.etNumero2.getText().toString());
    }

    public void dividir(View view) {
        presenter.division(b.etNumero1.getText().toString(), b.etNumero2.getText().toString());
    }

    public void calcular(View view) {
        presenter.calcular(b.resultadoSuma.getText().toString(), b.resultadoSuma.getText().toString());
    }


    @Override
    public void verResultadoSuma(String resultado) {
        b.resultadoSuma.setText(resultado);
    }

    @Override
    public void verResultadoResta(String resultado) {
        b.resultadoResta.setText(resultado);
    }

    @Override
    public void verResultadoMultiplicacion(String resultado) {
        b.resultadoMultiplicacion.setText(resultado);
    }

    @Override
    public void verResultadoDivision(String resultado) {
        b.resultadoDivision.setText(resultado);
    }

    @Override
    public void verError(String error) {
        b.resultadoSuma.setText(error);
    }

    @Override
    public void verResultadoCalcular(String resultado) {
        setContentView(R.layout.activity_main2);
        TextView tvMain2 = findViewById(R.id.tvMain2);
        tvMain2.setText(resultado);
        Button btnAtras = findViewById(R.id.btnAtras);
        btnAtras.setOnClickListener(v->{
           startActivity(new Intent(this,MainActivity.class));
        });
    }

    @Override
    public void verNumero(int numero) {
        setContentView(R.layout.hola);
        TextView tvNumero = findViewById(R.id.tvNumero);
        tvNumero.setText(String.valueOf(numero));
        Button salir = findViewById(R.id.btnSalir);
        salir.setOnClickListener(v->{
            startActivity(new Intent(this,MainActivity.class));
        });
    }



}