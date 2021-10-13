package com.generation;



public class Main {

    public static void main(String[] args) {

//        String mensaje  = saludar ( "Frida");
//        System.out.println(mensaje);
//
//        int resultado = suma(5,3);
//        System.out.println(resultado);
//
//        alerta("Prueba");


        //Libreria Math

//        System.out.println(Math.PI);
//        double num1 = 13.75;
//        double num2 = 21.85;
//            //Redondea hacia arriba
//        System.out.println(Math.ceil(num1));
//            //Sacar Raiz cuadrada
//        System.out.println(Math.sqrt(num2));


        //Cadenas
        String mensaje1 = "Bye";
        String mensaje2 = "bye";
            //Legth nos devuelve el numero de caracteres de un string
        //System.out.println(mensaje2.length());
            // equals compara dos strings y devuelve verdadero o falso.
            //equalsIgnoreCase compara pero no importa si estan en may o min.
       // System.out.println(mensaje1.equalsIgnoreCase(mensaje2));



    }


    public static String saludar (String nombre){


        return "Hola " + nombre;
    }
    public static  int suma (int num1, int num2){


        return num1 + num2;
    }

    //Metodo que ejecuta una logica
    public static void alerta(String mensaje){
        System.out.println(mensaje);


    }




}
