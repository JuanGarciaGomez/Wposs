package com.example.ejemplomvp.presenter;

import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.model.TipoModel;

public class TipoPresenter implements TipoInterface.Presenter {

    private TipoInterface.View view;
    private TipoInterface.Model model;

    public TipoPresenter(TipoInterface.View view){
        this.view = view;
        model = new TipoModel(this);
    }



    @Override
    public void suma(String etNumero1, String etNumero2) {
        if(view!=null){  model.suma(etNumero1,etNumero2); }
    }
    @Override
    public void verResultadoSuma(String resultado) {
        if(view!=null){ view.verResultadoSuma(resultado); }
    }

    @Override
    public void resta(String etNumero1, String etNumero2) {
        if(view!=null){ model.resta(etNumero1,etNumero2); }
    }
    @Override
    public void verResultadoResta(String resultado) {
        if(view!=null){ view.verResultadoResta(resultado); }
    }

    @Override
    public void multiplicacion(String etNumero1, String etNumero2) {
        if(view!=null){ model.multiplicacion(etNumero1,etNumero2); }
    }
    @Override
    public void verResultadoMultiplicacion(String resultado) {
        if(view!=null){ view.verResultadoMultiplicacion(resultado); }
    }

    @Override
    public void division(String etNumero1, String etNumero2) {
        if(view!=null){ model.division(etNumero1,etNumero2); }
    }
    @Override
    public void verResultadoDivision(String resultado) {
        if(view!=null){ view.verResultadoDivision(resultado); }
    }

    @Override
    public void verError(String error) {
        if(view!=null){
            view.verError(error);
        }
    }

    @Override
    public void calcular(String numero1, String numero2) {
        if(view!=null){
            model.calcular(numero1,numero2); }
    }

    @Override
    public void verResultadoCalcular(String result) {
        if (view != null ) {
            view.verResultadoCalcular(result);
        }
    }

    @Override
    public void enviarNumero(int numero) {
        model.enviarNumero(numero);
    }

    @Override
    public void verNumero(int numero) {
        view.verNumero(numero);
    }
}
