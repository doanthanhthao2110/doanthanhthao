/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh;

/**
 *
 * @author Admin
 */
public class pheptoan {

    
    public static void main(String[]args){
        //cac phep toan voi so nguyen
        int a = 17, b =4,c;
        c = a + b;
        System.out.print("Phép cộng " + a+ "+" + b +"= "+ c);
        c = b - a;
        System.out.print("Phép trừ " + a+ "-" + b +"= "+ c);
        c = b * a;
        System.out.print("Phép Nhân " + a+ "*" + b +"= "+ c);
        c = b / a;
        System.out.print("Phép chia lấy phần nguyên  " + a+ "/" + b +"= "+ c);
        c = b % a;
        System.out.print("Phép chia lấy phân dư " + a+ "%" + b +"= "+ c);
        
        //cac phep toan voi so thuc
        double x = 14.3, y = 3.56, z;
        z = x + y;
        System.out.println("phep cong " + x + " + " + y + " = " + z);
        z = y - x ;
        System.out.println("phep tru " + y + " - " + x + " = " + z);
        z = y * x ;
        System.out.println("phep nhan " + x + " * " + y + " = " + z);
        z = y / x ;
        System.out.println("phep chia " + x + " / " + y + " = " + z);
        //cac phep toan tren kieu logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("phep AND " + (flag1 && flag2));
        System.out.println("phep OR " + (flag1 || flag2)); 
        System.out.println("phep NOT " + (!flag1));
        System.out.println("phep XOR " + (flag1^flag3));
        
        //Mot so phep toan co ban tren chuoi
        String s1 ="Hue University";
        String s2 = "University";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toLowerCase().contains(s2));
        s1 += " " + s2;
        System.out.println(s1);
        
    }
    
        
}
