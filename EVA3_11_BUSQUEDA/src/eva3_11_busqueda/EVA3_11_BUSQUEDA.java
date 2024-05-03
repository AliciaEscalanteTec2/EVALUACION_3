/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
                INSTRUCCIONES:
        - CREAR UN ARREGLO DE ENTEROS
        - LLENARLO CON VALORES ALEATORIOS 
        - IMPRIMIRLOS
        - PREGUNTARLE AL USUARIO EL VALOR A BUSCAR
        */

        int resp;
        Scanner captu = new Scanner (System.in);
        
        int arreglo [] = new int [10];
        
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random() * 100) +1;
        }
        for (int arr : arreglo) {
            System.out.println(arr);
        }
        
        //PREGUNTAR AL USUARIO QUE VALORES BUSCA
        System.out.println("");
        System.out.println("Que valor desea encontrar? ");
        resp = captu.nextInt();
        
        //BUSCAR 
        // - RECORRER EL ARREGLO (CICLO FOR)
        // - COMPARAR VALOR QUE BUSCADO CONTRA EL VALOR DEL ARREGLO (IF)
        // - DETENERSE SI LO ENCUENTRO, SINO, EL CUCLO TIENE QUE CONTINUAR HASTA
        // - ENTONTRAR EL VALOR 
        //REGRESAR LA BUSQUEDA, POSICIÓN O VERDADERO (SI LO ENCUENTRA)
        int posi = -1; //-1 para que no exista en el arreglo de la posición 0
        for (int i = 0; i < arreglo.length; i++) {  //La i son posiciones del arreglo
            if (resp == arreglo[i]) {
                posi = i; //Se almacena la posicion donde esta el valor
                break;
                
            }
        }
        System.out.println("Posicion = " + posi);
        
    }
                //ALICIA ESCALANTE SOSA     No.control = 24550008
}
