package com.example.ejemplomvp.model;

import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.operaciones.OperacionesMatematicas;

public class TipoModel implements TipoInterface.Model {

    private TipoInterface.Presenter presenter;

    public TipoModel(TipoInterface.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void suma(String etNumero1, String etNumero2) {
        if(etNumero1.equals("") || etNumero2.equals("")){
            presenter.verError("Debe escribir los numeros en las dos casillas");
        }else{
            float suma = OperacionesMatematicas.sumarDosNumeros(Float.parseFloat(etNumero1), Float.parseFloat(etNumero2));
                presenter.verResultadoSuma(String.valueOf(suma));
            }
        }

    @Override
    public void resta(String etNumero1, String etNumero2) {
        if(etNumero1.equals("") || etNumero2.equals("")){
            presenter.verError("Debe escribir los numeros en las dos casillas");
        }else{
            float resta = OperacionesMatematicas.restarDosNumeros(Float.parseFloat(etNumero1), Float.parseFloat(etNumero2));
            presenter.verResultadoResta(String.valueOf(resta));
        }
    }

    @Override
    public void multiplicacion(String etNumero1, String etNumero2) {
        if(etNumero1.equals("") || etNumero2.equals("")){
            presenter.verError("Debe escribir los numeros en las dos casillas");
        }else{
            float multiplicar = OperacionesMatematicas.multiplicarDosNumeros(Float.parseFloat(etNumero1), Float.parseFloat(etNumero2));
            presenter.verResultadoMultiplicacion(String.valueOf(multiplicar));
        }
    }

    @Override
    public void division(String etNumero1, String etNumero2) {
        if(etNumero1.equals("") || etNumero2.equals("")){
            presenter.verError("Debe escribir los numeros en las dos casillas");
        }else{
            float dividir = OperacionesMatematicas.dividirDosNumeros(Float.parseFloat(etNumero1), Float.parseFloat(etNumero2));
            presenter.verResultadoDivision(String.valueOf(dividir));
        }
    }

    @Override
    public void calcular(String numero1, String numero2) {
        if(numero1.equals("") || numero2.equals("")){
            presenter.verError("Calcular esta vacio");
        }else{
            float calcular = OperacionesMatematicas.calcularDosNumeros(Float.parseFloat(numero1), Float.parseFloat(numero2));
            presenter.verResultadoCalcular(String.valueOf(calcular));
        }
    }

    @Override
    public void enviarNumero(int numero) {

        presenter.verNumero(numero);
    }
}

