/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author Usuario
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
                    ARREGLOS:
        JAVA: 0 primer elemento
        N - 1 último elemento
        N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        */
        
        /*
                    INSTRUCCIONES:
        Crear un arreglo y llenarlo de valores aleatorios
        */
        //int datos[], x,y; --> SOLO datos ES UN ARREGLO
        //int[] datos, x,y; --> TODAS LAS VARIABLES SON ARREGLOS
        int datos[] = new int[10]; //Aquí el arreglo tiene 10 elementos
        
        //Quiero valores aleatorios entre 0 y 99  
        for (int i = 0; i < datos.length; i++) { //Van desde 0 hasta 9
            datos[i]= (int)(Math.random() *100); //Números entre 0 y 99
        } 
        //Imprimir los elementos del arreglo:
        for (int i = 0; i < datos.length; i++) { //Van desde 0 hasta 9
            System.out.print("[" + datos[i] + "]");
        }
               //ALICIA ESCALANTE SOSA     No.control = 24550008
    }
    
}
