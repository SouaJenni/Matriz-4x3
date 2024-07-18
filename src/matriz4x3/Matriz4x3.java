/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz4x3;

import java.util.Scanner;

/**
 *
 * @author Daniel Dória
 */
public class Matriz4x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [4][3];
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite 12 números: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nSua matriz: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println( );
        }
        
        scanner.close();
    }
    
}
