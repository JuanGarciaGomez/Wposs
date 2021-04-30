package com.example.ejemplomvp.model;

import com.example.ejemplomvp.Interface.TipoInterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TipoModelTest2 {

    private TipoInterface.Presenter presenter;

   private TipoModel model = new TipoModel(presenter);

/*   @Test
    public void Prueba(){

         sTRINGmodel.suma("2","3");
       String expected= "5";
       assertArrayEquals(expected,);


   }*/




}