package com.semillero.mvpensayoapp;

public class AlCuadradoModel implements  AlCuadrado.Model{

    //como interactua con el presentador, se define y/o delcara tambien en la clase
    private AlCuadrado.Presenter presenter;
    private double resultado;



    //Creamos el constructor y le ingresamos una vista del presenter
    public AlCuadradoModel(AlCuadradoPresenter Presenter) {
        this.presenter = Presenter;
    }

    @Override
    public void alCuadrado(String data) {
        if (data.equals("")){
            presenter.showError("Campo Vacio");

        }else{
            resultado = Double.valueOf(data) * Double.valueOf(data);
            presenter.showResult( String.valueOf(resultado)); //Llamamos el presentador y se asigna el metodo para mostrar el resultado y se parsea el resultado

        }



    }
}
