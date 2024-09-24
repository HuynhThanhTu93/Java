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
public class bai7_HinhTron {
    public static void main(String[] args) {
        System.out.println("TINH DIEN TICH CHU VI HINH TRON");
        Scanner nhap = new Scanner(System.in);
        
        double r, chuVi, dienTich;
        System.out.print("Nhap ban kinh: ");
        r = nhap.nextDouble();
        
        chuVi = Math.PI * 2*r;
        dienTich = Math.PI * r*r;
        System.out.println("Chu Vi = " + chuVi);
        System.out.println("Dien Tich = " + dienTich);
        
    }
}
