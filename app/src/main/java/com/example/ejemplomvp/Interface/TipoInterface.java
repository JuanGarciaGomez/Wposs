package com.example.ejemplomvp.Interface;

public interface TipoInterface {
    /**
     * metodos que van a MainActivity
     */
    interface View{
        void verResultadoSuma(String resultado);
        void verResultadoResta(String resultado);
        void verResultadoMultiplicacion(String resultado);
        void verResultadoDivision(String resultado);
        void verError(String error);
        void verResultadoCalcular(String resultado);
        void verNumero(int numero);
    }

    /**
     * metodos que van a TipoPresentador
     */
    interface Presenter{
        /**
         * suma : se usara par sumar dos nuemros
         * @param etNumero1 > viene de MainActivity
         * @param etNumero2 > viene de MainActivity
         */
        void suma(String etNumero1, String etNumero2);
        /**
         * verResultadoSuma : va a ir al presentador par poder enviarle al view
         * @param resultado
         */
        void verResultadoSuma(String resultado);

        void resta(String etNumero1, String etNumero2);
        void verResultadoResta(String resultado);

        void multiplicacion(String etNumero1, String etNumero2);
        void verResultadoMultiplicacion(String resultado);

        void division(String etNumero1, String etNumero2);
        void verResultadoDivision(String resultado);

        void verError(String error);

        void calcular(String numero1, String numero2);
        void verResultadoCalcular(String result);

        void enviarNumero(int numero);
        void verNumero(int numero);
    }

    /**
     * metodos que van a TipoModel
     */
    interface Model{
        /**
         * suma : se envia a Tipo model y es donde se ejecuta la suma
         * @param etNumero1
         * @param etNumero2
         */
        void suma(String etNumero1, String etNumero2);
        void resta(String etNumero1, String etNumero2);
        void multiplicacion(String etNumero1, String etNumero2);
        void division(String etNumero1, String etNumero2);
        void calcular(String numero1, String numero2);
        void enviarNumero(int numero);
    }

}
