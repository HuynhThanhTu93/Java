/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class Bai14_ArrayList {
    public static void main(String[] args) {
        System.out.println("IN ARRAY");
        
        
        ArrayList a = new ArrayList();
        for(int i = 1; i < 101; i++)
        {
            a.add(i);
        }
        a.add("ThanhTu");
        a.remove(60);
        a.remove(a.indexOf(60));
        System.out.println("Mang: " + a);
        System.out.println("Size mang = " + a.size());
    }
}
