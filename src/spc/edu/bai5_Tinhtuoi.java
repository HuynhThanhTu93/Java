/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class bai5_Tinhtuoi {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH TUOI");
        
        Scanner nhap = new Scanner(System.in);
        
        int a, tuoi;
        String Ten;
        
        System.out.print("Ho va ten:");
        Ten = nhap.nextLine();
        
        System.out.print("Nhap nam sinh: ");
        a = nhap.nextInt();
     
        int b = Year.now().getValue();
        
        tuoi = b-a;
        System.out.println("Tuoi: " + tuoi);
    }
}
