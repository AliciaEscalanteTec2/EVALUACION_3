/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RECORDANDO LOS ACUMULADORES:
        //int suma = 0;
        //System.out.println(suma);
        //suma *=2;
        //System.out.println(suma);
        //suma *=2;
        //System.out.println(suma);
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Base: ");
        int base = captu.nextInt();
        System.out.println("Potencia: ");
        int pot = captu.nextInt();
        int resu = calcularPot(base, pot);
        System.out.println("El resultado es = "+resu);
    }
    
    //CREAR UNA FUNCIÓN POTENCIA QUE CALCULE LA POTENCIA DE UN VALOR ENTERO
    public static int calcularPot(int base, int potencia){
        //Necesitamos un acumulador 
        //suma = suma * valor;
        //suma *= valor;
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
        return resu;
    }
                //ALICIA ESCALANTE SOSA         No.Control = 24550008
}
