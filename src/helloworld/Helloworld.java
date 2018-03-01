/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author ssurapan
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length > 0)
        {
            System.out.println(myMethod(args[0]));
           
        }
       else
        {
            System.out.println(myMethod("test"));
        }
       
    }
    public static String myMethod(String name){
        return "hello world -" +name;
       
    }
}
