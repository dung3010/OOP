/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hungdung.oop_th1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai04a {
    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void xuatMang(int[] a) {
        for ( var i : a) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }
    
    public static boolean isPrime(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
    
    

    
    public static void main(String[] args) {
        int[] a = nhapMang(5);
        xuatMang(a);
        System.out.println(IntStream.of(a).sum()); // Stream tinh tong mang (max, min)
        System.out.println(IntStream.of(a).filter(x -> isPrime(x) == true).sum()); // Stream tinh tong cac so nguyen to
    }
}
