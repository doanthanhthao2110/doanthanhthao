/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author Admin
 */
public class Wekapro {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myknowledgeModel model=  new myknowledgeModel(
                "C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
        System.out.println(model);
        model.saveData("D:\\data\\iris.arff");
    }
    
}
