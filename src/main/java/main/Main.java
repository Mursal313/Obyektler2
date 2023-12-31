/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Scanner;
import test.Util;

/**
 *
 * @author mrust
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        // Obyekt eslinde oz gosderdiyi classa referans olur
        // User u  = new User();
        // u = new User(); 
        // Eyni ikinci obyekti yaratdiqda bu obyekt basqa elementleri 
        // gosderir ve evvelki ekrana null yeni bosluq cap olunur
        // System.out.println(u.name);
        // int a = 10; Yazsaq bu oz daxilinde deyeri saxlayir reference saxlamir

        // int[] arr = {9}; 
        // Arrey yaratmaq ele obyekt yaratmaq demekdir elementleri 
        // reference sayilir
        // u = new User();
        // Yuxarida yazilan (String[] args) eslinde bir arraydir
        User u = new User();
        System.out.println("Adinizi daxil edin :");
        u.setName(scan.next());
        System.out.println(u.getName());
        Util.name = "Mursel";
        // Obyekt icinde obyekt
        
       
    }

    public static void change() {
  
    }

    public static void changeArr(int[] arr) {
        
    }
}
