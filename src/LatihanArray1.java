
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
public class LatihanArray1 {
    public static void main(String[] args) {
        int i;
        int[] nilaiakhir;
        nilaiakhir = new int[8];
        Scanner input = new Scanner(System.in);
        for(i = 0;i<6;i++){
            System.out.println("Masukkan array ke :" + i);
            nilaiakhir[i] = input.nextInt();
        }
        for(i = 0;i<6;i++){
            System.out.println("Nilai Akhir ke " + i);
            System.out.println(nilaiakhir[i]);
        }
    }
    
}
