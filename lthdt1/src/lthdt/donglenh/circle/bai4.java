/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.circle;

/**
 *
 * @author Admin
 */
public class bai4 {
    public static void main(String[] agrs ){
        circle htron = new circle(5, 1, 2);
        System.out.println("chi vi cua hinh tron la : " +htron.calcPerimeter());
        System.out.println("Dien tich cua hinh tron la : " +htron.calcArea());
        
        Rectangle hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("Chu Vi HCN " +hcn.calcPerimeter());
        System.out.println("Dien tich HCN " + hcn.calcArea());
    }
}
