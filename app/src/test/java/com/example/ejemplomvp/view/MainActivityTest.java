package com.example.ejemplomvp.view;

import com.example.ejemplomvp.Interface.TipoInterface;
import com.example.ejemplomvp.model.TipoModel;
import com.example.ejemplomvp.presenter.TipoPresenter;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest extends TestCase {

    @Mock
    private TipoPresenter presenter;

    private MainActivity mainActivity;


    @Before
    public  void setup(){
        presenter = new TipoPresenter(mainActivity);
    }


//    verify(mock).someMethod();
//    verify(mock, times(10)).someMethod();
//    verify(mock, atLeastOnce()).someMethod();


//    @Test
//    public void testVerResultadoSumaTipoview(){
//        presenter.verResultadoSuma("4");
//        verify(mainActivity).verResultadoSuma("4");
//    }
//
//    @Test
//    public void testVerResultadoRestaTipoview(){
//        presenter.verResultadoResta("1");
//        verify(mainActivity).verResultadoResta("1");
//
//    }
//
//    @Test
//    public void testVerResultadoMultiplicacionTipoview(){
//        presenter.verResultadoMultiplicacion("5");
//        verify(mainActivity).verResultadoMultiplicacion("5");
//
//    }
//
//    @Test
//    public void testVerResultadoDivisionTipoview(){
//        presenter.verResultadoDivision("12");
//        verify(mainActivity).verResultadoDivision("12");
//
//    }
//
//    @Test
//    public void testVerErrorTipoview(){
//        presenter.verResultadoDivision("Error");
//        verify(mainActivity).verResultadoDivision("Error");
//
//    }
//
//    @Test
//    public void testVerResultadoCalcularTipoview(){
//        presenter.verResultadoCalcular("1002");
//        verify(mainActivity,times(1)).verResultadoCalcular("1002");
//
//    }
//
//    @Test
//    public void testVerNumeroTipoview(){
//        presenter.verNumero(3);
//        verify(mainActivity).verNumero(3);
//    }


}