/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hungdung.oop_th1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai03c {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/main/resources/data.txt");
        File fo = new File("src/main/resources/out.txt");
        try ( Scanner sc = new Scanner(f);  
                PrintWriter w = new PrintWriter(fo)) {
            String c = sc.nextLine();
            c = c.replaceAll("\\{File\\}", "tap tin");
            w.print(c);
        }
    }
}
