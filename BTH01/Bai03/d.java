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
public class Bai03d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String c = sc.nextLine();
        String[] tmp = c.split("[\\s,;]+");
        String kq = "";
        for (var x : tmp) {
            kq += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        System.out.print(kq.trim());
    }
}
