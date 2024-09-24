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
public class bai6_ChuVi_DienTich {
    public static void main(String[] args) {
        System.out.println("TinhChuViDienTich");
        Scanner nhap = new Scanner(System.in);
        
        double a,b,chuVi,dienTich ;
        
        System.out.print("Nhap chieu dai: ");
        a = nhap.nextDouble();
        
        System.out.print("Nhap chieu rong: ");
        b = nhap.nextDouble();
        
        chuVi = (a + b)*2;
        System.out.println("Chu Vi = " + chuVi);
        
        dienTich = a*b;
        System.out.println("Dien Tich = " + dienTich);
    }
}
