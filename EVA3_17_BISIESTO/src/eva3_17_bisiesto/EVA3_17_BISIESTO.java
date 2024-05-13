/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la fecha:  ");
        int año = captu.nextInt();
        boolean resp = esBisiesto(año);
        if (resp) {
            System.out.println("El año es bisiesto");
        }
        else{
            System.out.println("El año no es bisiesto");
        }
    }
    
    public static boolean esBisiesto(int año){
        int div;
        int residuo1, residuo2, residuo3;
        boolean resp = false;
        
        div = año / 4;
        residuo1 = año % 4;
        residuo2 = año % 100;
        residuo3 = año % 400;
        
        if (residuo1 == 0) {
            return true;
        }else{
            if (residuo2 == 0 && residuo3 == 400) {
                return true;
            }else{
                return false;
            }
        }

    }
    
            //ALICIA ESCALANTE SOSA         No.Control = 24550008
    
}
