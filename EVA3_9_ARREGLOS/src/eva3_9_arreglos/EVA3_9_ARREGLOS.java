/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OTRA FORMA DE PONER UN ARREGLO PARA CUALQUIER TIPO Y CON DATOS PEQUEÑOS
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles",
                               "Jueves", "Viernes", "Sabado"}; //Arreglo de 7
        
        //Para char es solo con comillas simples y solo un caracter
        char vocales[] = {'a','e','i','o','u'}; //Arreglo de 5 
        
        System.out.println("Tamaño del arreglo diasSemana = " + diasSemana.length );
        System.out.println("Tamaño del arreglo vocales = " + vocales.length );
        System.out.println("");
        
        System.out.println("Dias de la semana: ");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }
        System.out.println("");
        
        System.out.println("Vocales: ");
        for (int i = 0; i < vocales.length; i++) {
            System.out.print(vocales[i]);
        }
        System.out.println("");
        System.out.println("");
        String menu[] = {"Archivo", "Nueva Factura", "Modificar", "Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+ "-" + menu[i]);
        }
        
    }
            //ALICIA ESCALANTE SOSA     No.control = 24550008
}
