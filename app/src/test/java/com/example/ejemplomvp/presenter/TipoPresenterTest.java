package com.example.ejemplomvp.presenter;

import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.model.TipoModel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TipoPresenterTest{
    @Mock
    private TipoInterface.View view;

    private TipoPresenter presenter;

    @Before
    public  void setup(){
        presenter = new TipoPresenter(view);
    }

    @Test
    public void testCalcularTipoPresenter(){

        presenter.calcular("2","2");
        verify(view).verResultadoCalcular("4.0");
    }

    @Test
    public void testSumaTipoPresenter(){
        presenter.suma("2","2");
        verify(view).verResultadoSuma("4.0");
    }

    @Test
    public void testRestaTipoPresenter(){
        presenter.resta("2","2");
        verify(view).verResultadoResta("0.0");
    }

    @Test
    public void testDivisionTipoPresenter(){
        presenter.division("2","2");
        verify(view).verResultadoDivision("1.0");
    }

    @Test
    public void testMultiplicacionTipoPresenter(){
        presenter.multiplicacion("2","2");
        verify(view).verResultadoMultiplicacion("4.0");
    }

    @Test
    public void testVerErrorTipoPresenter(){
        presenter.verError("Hola");
        verify(view).verError("Hola");

    }

    @Test
    public void testVerNumeroTipoPresenter(){
        presenter.enviarNumero(2);
        verify(view).verNumero(2);
    }

}