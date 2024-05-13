/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("=======CONVERTIDORES========");
        System.out.println("1- Convertir centigrados a Farenheit");
        System.out.println("2. Convertir centigrados a Kelvin");
        System.out.println("3. Convertir Farenheit a centigrados");
        System.out.println("4. Convertir Kelvin a Farenheit");
        System.out.println("5. Convertir Farenheit a Kelvin");
        System.out.println("Escoge una opcion: ");
        resp = captu.nextInt();
        
        if (resp == 1) {
            System.out.println("Ingresa los centigrados: ");
            double centigrados = captu.nextDouble();
            double faren = convertirCaF(centigrados);
            System.out.println("De centigrados: "+centigrados+" °C "+ "a farenheit es: "+faren+" °F");
        }else
        if (resp == 2) {
            System.out.println("Ingresa los centigrados: ");
            double centig = captu.nextDouble();
            double kelvin = convertirCaK(centig);
            System.out.println("De centigrados: "+centig+" °C "+ "a kelvin es: "+kelvin+" K");
        }
        
        if (resp == 3) {
            System.out.println("Ingresa los farenheit: ");
            double fahr = captu.nextDouble();
            double cent = convertirCaK(fahr);
            System.out.println("De farenheit: "+fahr+" °F "+ "a centigrados es: "+cent+" °C");
        }else
        if (resp == 4) {
            System.out.println("Ingresa los kelvin: ");
            double kelv = captu.nextDouble();
            double far = convertirCaK(kelv);
            System.out.println("De kelvin: "+kelv+" °K "+ "a farenheit es: "+far+" °F");
        }
        if (resp == 5) {
            System.out.println("Ingresa los farenheit: ");
            double farenhe = captu.nextDouble();
            double ke = convertirCaK(farenhe);
            System.out.println("De farenheit: "+farenhe+" °F "+ "a kelvin es: "+ke+" °K");
        }
        
    }
    
    public static double convertirCaF(double centigrados){
        double faren;
        faren = (centigrados * 9 /5) +32;
        return (faren);
    }
    
    public static double convertirCaK(double centig){
        double kelvin;
        kelvin = (centig + 273.15);
        return (kelvin);
    }
    
    public static double convertirFaC(double fahr){
        double cent;
        cent = (fahr - 32) * 5/9;
        return cent;
    }
    
    public static double convertirKaF(double kelv){
        double far;
        far = (kelv - 273.15) * 9/5 + 32;
        return far;
    }
    
    public static double convertirFaK(double farenhe){
        double ke;
        ke = (farenhe - 32) * 5/9 + 273.15;
        return ke;
    }
    
            //ALICIA ESCALANTE SOSA         No.Control = 24550008
}
