/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihann3;

import java.util.Scanner;

/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class Latihann3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan n : ");
        int n = masukan.nextInt();

        int hasil = 0;
        for (int i = 1; i <= n; i++) {
            hasil += i;
        }

        System.out.println("Jadi, hasilnya adalah = "+hasil);

    }

      
    }
    

