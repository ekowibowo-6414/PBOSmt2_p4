
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LatihanArray2 {
    public static void main(String[] args) {
        int i,j;
        int[][] data_jual;
        data_jual = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Masukkan data Jual ke [" +i+"]["+j+"]");
                data_jual[i][j]= input.nextInt();
                
            }
            System.out.println();
        }
        System.out.println("Data yang diinput ke elemen array ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Data jual index ["+i+"]"+"["+j+"] " );
                System.out.println("="+data_jual[i][j]);
            }
        }
        
        
    }
    
}
