package com.example.ejemplomvp.operaciones;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperacionesMatematicasTest {

    OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();


    @Test
    public void testsSumarDosNumeroOpMath(){
        assertEquals(5,operacionesMatematicas.sumarDosNumeros(3f,2f),0.1);
    }

    @Test
    public void testsRestarDosNumeroOpMath(){
        assertEquals(1,operacionesMatematicas.restarDosNumeros(3f,2f),0.1);
    }


    @Test
    public void testsMultiplicarDosNumeroOpMath(){
        assertEquals(6,operacionesMatematicas.multiplicarDosNumeros(3f,2f),0.1);
    }

    @Test
    public void testsDividirDosNumeroOpMath(){
        assertEquals(4,operacionesMatematicas.dividirDosNumeros(8f,2f),0.1);
    }

    @Test
    public void testsCalcularDosNumeroOpMath(){
        assertEquals(10,operacionesMatematicas.calcularDosNumeros(8f,2f),0.1);
    }


}