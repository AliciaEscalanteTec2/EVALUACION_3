/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    //Crear un método calcularSumatoria 
    //Regresar un metodo entero (Por ejemplo si quiero el 5, imprimir el 1+2+3+4+5 = resultado

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int num = captu.nextInt();
        int sumatoria = calculadoraSumatoria(num);
        System.out.println("El resultado es = "+sumatoria);

    }
    
    public static int calculadoraSumatoria(int num){
        int sumatoria = 0;
        for (int i = 1; i <= num; i++) {
            sumatoria = sumatoria + i;
        }
        return sumatoria;
    }
    
}
