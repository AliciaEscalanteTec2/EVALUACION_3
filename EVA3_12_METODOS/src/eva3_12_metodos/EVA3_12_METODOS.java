/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author Usuario
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar al método --> Llamar al método --> call
        mostrarMensaje("Hola mundo cruel!!");
        mostrarMuchosMensajes("Hola!!!", 5);
    }
    //          ESQUEMA DE LOS MÉTODOS:
    //public static --> Para la materia de POO    codificadores 
    //void --> (Tipo de dato) valor que regresa el método
    //void --> No regresa nada 
    //nombre del método --> Identificador válido
    //                      Empezar en minisculas, debe ser un verbo
    //() <--- Parámetros del método (argumentos) --> valores que necesita para 
    //funcionar 
    public static void mostrarMensaje(String mensaje){ //Encabezado (nombre del método)
        //Cuerpo del método: Aquí va nuestro código
        System.out.println(mensaje);
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){ //No deben tener muchas letras, esto es solo para explicar
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    } 
            //ALICIA ESCALANTE SOSA         No.Control = 24550008
}
