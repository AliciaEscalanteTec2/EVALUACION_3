/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    
    //El void no regresa un valor, no regresa en este caso un return
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Valor 1: ");
        int val1 = captu.nextInt();
        System.out.println("Valor 2: ");
        int val2 = captu.nextInt();
        //LLAMAR A LA FUNCIÓN
        //1.Guardar el resultado: OPCIÓN 1 --> cONVIENE SI USAMOS EL RESULTADO MUCHAS VECES
        int resu = sumar(val1, val2);
        System.out.println("La suma es = "+resu);
        //2.Usar directamente el resultado de la función OPCIÓN 2 --> CONVIENE CUANDO SOLO LO VAMOS A USAR 2 VEZ
        System.out.println("La suma es = "+sumar(val1, val2));
        //3.Ignorar el resultado
        sumar(val1, val2);
    }
    
    //En este caso el int si requiere el return
    public static int sumar(int num1, int num2){
        int resu = num1 + num2;
        
        return resu;  //Es como el break (hasta ahí termina el método)
        //Despues del return ya no puedo poner más instrucciones
    }
    
            //ALICIA ESCALANTE SOSA         No.Control = 24550008
    
}
