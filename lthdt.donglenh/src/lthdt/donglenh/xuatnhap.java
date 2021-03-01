/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xuatnhap {
    public static void main(String[]args){
        boolean flag = true;
        int a = 15;
        byte b = 2;
        Double c = 12.6;
        float d = 4.5f;
        String s = "Hello world";
        char ch = 'A';
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập họ tên: ");
        String hoten = sc.nextLine();
        System.out.println("Bạn đã nhập họ tên là: "+hoten);
        
        System.out.print("Hãy nhập vào một số nguyên: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("Số nguyên mà bạn đã nhập là: "+a);
        
         System.out.print("Hãy nhập vào một số thực: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("Số thưc mà bạn đã nhập là: "+c);
    }
    
}


