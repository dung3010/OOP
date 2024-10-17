/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hungdung.oop_th1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bac cua da thuc n= ");
        int n = sc.nextInt();
        System.out.print("Nhap gia tri x cua da thuc x= ");
        double x = sc.nextDouble();
        double gt = 0;
        for (int i = 0; i <= n; i++) {
            System.out.printf("He so thu %d = ", i);
            double a = sc.nextDouble();
            gt += a * Math.pow(x, i);
        }
        System.out.printf("Gia tri cua da thuc la: %.0f\n", gt);
    }
}
