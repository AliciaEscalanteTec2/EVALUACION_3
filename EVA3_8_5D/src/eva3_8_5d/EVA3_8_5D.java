/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_5d;

/**
 *
 * @author Usuario
 */
public class EVA3_8_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuboC[][][][][] = new int[1][2][3][4][5]; //120 enteros
        
        for (int i = 0; i < cuboC.length; i++) { //Primer dimensión  filas
            for (int j = 0; j < cuboC[i].length; j++) { //Segunda dimensión  columnas
                for (int k = 0; k < cuboC[i][j].length; k++) { //Tercera dimensión  profundidad
                    for (int l = 0; l < cuboC[i][j][k].length; l++) {
                        for (int m = 0; m < cuboC[i][j][k][l].length; m++) {
                            cuboC[i][j][k][l][m] = (int) (Math.random() * 100);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < cuboC.length; i++) { //Primer dimensión  filas
            for (int j = 0; j < cuboC[i].length; j++) { //Segunda dimensión  columnas
                for (int k = 0; k < cuboC[i][j].length; k++) { //Tercera dimensión  profundidad
                    for (int l = 0; l < cuboC[i][j][k].length; l++) {
                        for (int m = 0; m < cuboC[i][j][k][l].length; m++) {
                            System.out.println("[" + cuboC[i][j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
        
    }
    
                //ALICIA ESCALANTE SOSA     No.control = 24550008
    
}
