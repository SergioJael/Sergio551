
package ex4;
import funciones.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

    public static void main(String[] args) throws IOException {
       BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
       int numero;
       
       func funcion = new func();
       
        System.out.println("Ingresa el numero: ");
        numero= Integer.parseInt(bufEntrada.readLine());
        
        System.out.println(funcion.retornaMultiplo(numero));
    }

    
    
}