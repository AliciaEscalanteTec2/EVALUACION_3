/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author Usuario
 */
public class EVA3_10_FOREACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles",
                               "Jueves", "Viernes", "Sabado"}; //Arreglo de 7
        
        //El foreach es una forma simplificada del for
        for (String dia : diasSemana) {
            System.out.println(dia);
        }
        //La desventaja del foreach es que no nos da las posiciones y no se pueden
        //imprimir en inverso, de primero al final 
        System.out.println("");
        int salario[] = {50, 1000, 453, 5839, 2039, 910, 2831};
        for(int cant: salario){
            System.out.println("$" + cant);
        }
        
        System.out.println("");
        //INSTRUCCIONES: MESES DEL AÑO, IMPRIMIR CON FOR-EACH 
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
                        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
                        "Noviembre", "Diciembre"};
        for (String mes : meses) {
            System.out.println(mes);
        }
        
        
    }
                //ALICIA ESCALANTE SOSA     No.control = 24550008
}
