/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcuentaletras;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author avanza
 */
public class HashCuentaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Hashtable<String, Integer> tabla = new Hashtable<String, Integer>();

        String texto = entrada.nextLine();
        char ch;

        int valor;
        for (int i = 0; i < texto.length(); i++) {
            ch = texto.charAt(i);
            if (Character.isAlphabetic(ch)) {//si es una letra
                if (tabla.containsKey(String.valueOf(ch)) == false) {
                    tabla.put(String.valueOf(ch), 1);
                } else {
                    valor = tabla.get(String.valueOf(ch));//sacamos el valor que tiene el elemento de clave a
                    valor++;//subimos uno su valor
                    tabla.put(String.valueOf(ch), valor);//actualizamos el valor en la tabla
                }
            }
        }
        //para finalizar mostramos la hasttable
        Enumeration<String> key=tabla.keys();
        Enumeration<Integer> value=tabla.elements();
        String letra;
        int contador;
        System.out.println("Letras\tRepeticiones");
        System.out.println("_____________________");
        while(key.hasMoreElements()){
        letra= key.nextElement();
        contador= value.nextElement();
        System.out.println("    "+letra+"\t\t"+contador);
        }
        
        
        
        //System.out.println(tabla.toString());
    }
}
