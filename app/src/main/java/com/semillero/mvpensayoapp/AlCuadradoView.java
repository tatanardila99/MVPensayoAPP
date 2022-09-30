package com.semillero.mvpensayoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View {

    private TextView tvAlCuadrado;
    private EditText edAlCuadrado;

    private  AlCuadrado.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tvAlCuadrado = (TextView) findViewById(R.id.tvAlCuadrado);
        edAlCuadrado = (EditText) findViewById(R.id.edAlCuadrado);
        presenter = new AlCuadradoPresenter(this);
    }

    public void calcular(View view){
        presenter.alCuadrado(edAlCuadrado.getText().toString());

    }



    //implmentacion de la interfaz View
    @Override
    public void showResult(String result) {
        tvAlCuadrado.setText(result); //Nos recibe el resultado y lo muestra en el textview

    }

    @Override
    public void showError(String error) {
        tvAlCuadrado.setText(error); //mostrar error si est vacio
    }
}