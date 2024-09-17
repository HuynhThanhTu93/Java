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
public class Bai4_TinhNhan {
    public static void main(String[] args) {
        System.out.println("Tinh Tich");
        double a, b, tich;
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        a = nhap.nextDouble();
       
        System.out.print("Nhap b: ");
        b = nhap.nextDouble();
        
        tich = a*b;
        System.out.println(a + " x " + b + " = " + tich);
    }
}
