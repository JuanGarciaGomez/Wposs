package com.example.ejemplomvp.model;

import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.operaciones.OperacionesMatematicas;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class TipoModelTest extends TestCase {

    @Mock
    private TipoInterface.Presenter presenter;

    private TipoModel model;

    @Before
    public void setUp() throws Exception{
        model = new TipoModel(presenter);
    }

/*    @Test
    public void testSumaTipoModel(){
            doNothing().when(model).suma(isA(String.class),isA(String.class));
            verify(presenter).verResultadoSuma("5");

    }*/

    @Test
    public void testcalcularTipoModel(){
        model.calcular("3","3");
        verify(presenter).verResultadoCalcular("6.0");

        model.calcular("","3");
        verify(presenter).verError("Calcular esta vacio");

    }

    @Test
    public void testRestaTipoModel(){
        model.resta("3","3");
        verify(presenter).verResultadoResta("0.0");

        model.resta("","3");
        verify(presenter).verError("Debe escribir los numeros en las dos casillas");

    }

    @Test
    public void testMultipliacionTipoModel(){
        model.multiplicacion("3","3");
        verify(presenter).verResultadoMultiplicacion("9.0");

        model.multiplicacion("","");
        verify(presenter).verError("Debe escribir los numeros en las dos casillas");

    }

    @Test
    public void testDivisionTipoModel(){
        model.division("3","3");
        verify(presenter).verResultadoDivision("1.0");

        model.division("","");
        verify(presenter).verError("Debe escribir los numeros en las dos casillas");

    }

    @Test
    public void testEnviarNumeroTipoModel(){
        model.enviarNumero(3);
        verify(presenter).verNumero(3);

    }




}