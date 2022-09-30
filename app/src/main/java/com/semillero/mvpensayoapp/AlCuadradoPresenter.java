package com.semillero.mvpensayoapp;

public class AlCuadradoPresenter implements AlCuadrado.Presenter {

    //como interactua con la vista y el modelo, se definen y/o delcaran tambien en la interfaz
    private AlCuadrado.View view;
    private AlCuadrado.Model model;


    //Creamos el constructor y le ingresamos una vista View
    public AlCuadradoPresenter(AlCuadrado.View view){
        this.view = view;
        model = new AlCuadradoModel(this); // Creamos una instancia de la clase model

    }


    @Override
    public void showResult(String result) {
        if(view != null){   //Comprobar que existe la vista
            view.showResult(result); //Se llamada el metodo de la interfaz view
        }

    }

    @Override
    public void alCuadrado(String data) {
        if(view != null){   //Comprobar que existe la vista
            model.alCuadrado(data); // Se ejecuta el metodo con el parametro que se le envia
        }


    }

    @Override
    public void showError(String error) {
        if(view != null){   //Comprobar que existe la vista
            view.showError(error); // Se ejecuta la alerta de error
        }

    }
}
