/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class bai8_LuyThua {
    public static void main(String[] args) {
        System.out.println("TINH LUY THUA");
        Scanner nhap = new Scanner(System.in);
        
        double so, mu, luyThua = 1;
        
        System.out.print("Nhap so: ");
        so = nhap.nextDouble();
        System.out.print("Nhap mu: ");
        mu = nhap.nextDouble();
        
        for (int i = 0; i < mu; i++) {
            luyThua *= so;           
        }
        System.out.println("Luy Thua cua "+ so + " = " + luyThua);
    }
}
