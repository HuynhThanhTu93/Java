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
public class De1_Cau1 {
    public static void main(String[] args) {
        int n, sum = 0, c;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.print("Nhap so phan tu: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    
    int array[] = new int[n];
         
    System.out.println("Nhap phan tu cho mang: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu " + i + ": ");
        array[i] = scanner.nextInt();
    }
           
    System.out.println("\nMang da nhap: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
          
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
    System.out.println("\nSum cac so = " + sum);
        System.out.println("\nTrung binh cac so = " + sum/n);
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (array[i] < array[j]) {
                c = array[i];
                array[i] = array[j];
                array[j] = c;
            }
        }
    }
    
    System.out.println("Mang sau khi sap xep: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
    
    System.out.println("\nSo nho nhat = " + array[n - 1]);
    System.out.println("\nSo lon nhat = " + array[0]);
}
    
    
    
    
}
