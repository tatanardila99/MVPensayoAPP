package com.semillero.mvpensayoapp;

public interface AlCuadrado {

    interface  View{
        void showResult(String result); //MOSTRAR EL RESULTADO EN LA VISTA
        void showError(String error);

    }


    interface  Presenter{
        void showResult(String result); //MUESTRA RESULTADO Y ENVIA A LA VISTA
        void alCuadrado(String data);    // INDICA QUE SE TIENE QUE MULTIPLICAR
        void showError(String error);


    }


    interface  Model{
        void alCuadrado(String data); // INDICA QUE SE TIENE QUE MULTIPLICAR, PERO EN EL MODELO

    }



}
