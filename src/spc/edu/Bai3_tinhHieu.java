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
public class Bai3_tinhHieu {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH HIEU 2 SO THAP PHAN");
        double a,b,hieu;
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        a = nhap.nextDouble();
       
        System.out.print("Nhap b: ");
        b = nhap.nextDouble();
        
        hieu = a-b;
        System.out.println(a + " - " + b + " = " + hieu);
        
    }
}
