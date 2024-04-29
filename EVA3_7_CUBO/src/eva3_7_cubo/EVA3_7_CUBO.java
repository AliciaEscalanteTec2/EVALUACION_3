/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_cubo;

/**
 *
 * @author Usuario
 */
public class EVA3_7_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo[][][] = new int[10][5][3]; //150 enteros
                             
        //SE REQUIEREN 3 FOR:
        for (int i = 0; i < cubo.length; i++) { //Primer dimensión  filas
            //El primer for contra las filas
            for (int j = 0; j < cubo[i].length; j++) { //Segunda dimensión  columnas
                for (int k = 0; k < cubo[i][j].length; k++) { //Tercera dimensión  profundidad
                    cubo[i][j][k] = (int) (Math.random() * 100);
                    
                }
            }
        }
        
        for (int i = 0; i < cubo.length; i++) { //Primer dimensión  filas
            //El primer for contra las filas
            for (int j = 0; j < cubo[i].length; j++) { //Segunda dimensión  columnas
                for (int k = 0; k < cubo[i][j].length; k++) { //Tercera dimensión  profundidad
                    System.out.println("[" + cubo[i][j][k] + "]");
                }
            }
        }
        
    }
                    //ALICIA ESCALANTE SOSA     No.control = 24550008
}
