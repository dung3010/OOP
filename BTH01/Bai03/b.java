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
public class Bai03b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String chuoi = sc.nextLine();
        int tmp = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if( Character.isUpperCase(chuoi.charAt(i))){
                tmp++;
            }
        }
        System.out.println("So ki tu hoa trong chuoi la: " + tmp);
    }
}
