/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
                    ARREGLOS
        LOS ARREGLOS EN JAVA SON OBJETOS
        TENEMOS QUE CREARLOS ANTES DE USARLOS
        */
        
        //Los corchetes son para manejar los indices: arreglo [3] acceso de la 
        //posición
        //El "new" pone la variable en la memoria
        
        //Declaración = creación (new) [tamaño del arreglo]
        int arreglo[] = new int [10]; //un arreglo de 10 enteros 
        //Se acceden a los datos a través de indices:
        //Conocer las posiciones de los valores:
        //PRIMER POSICIÓN DE UN ARREGLO ES CERO ---> 0
        //ULTIMA POSICIÓN DE UN ARREGLO ES --> N -1 , donde
        //N ES EL TAMAÑO DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("Valor de arreglo [1] = " + arreglo[1]);
        System.out.println(arreglo); //El arreglo es un objeto
        System.out.println(arreglo.length); //length me dice cuantos elementos 
        //puede almacenar mi arreglo
    }
     //ALICIA ESCALANTE SOSA     No.control = 24550008
}