/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_metodos_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    
    //IMPRIMIR UN ARREGLO USANDO MÉTODOS
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = new int [10];
        datos = llenar(datos); //Mandamos el areglo, nos lo devuelve de datos aleatorios
        imprimir(datos); //Imprime los valores del arreglo 
        System.out.println("");
        
        int[] datos2 = new int [15];
        datos2 = llenar(datos2);
        imprimir(datos2);
      
    }
    
    //Cualquier tipo de dato puede estar en los métodos
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }
    
    public static int[] llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        return arreglo;
    }
    
            //ALICIA ESCALANTE SOSA No.Control = 24550008
}
