/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propedia;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class Propedia {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
   
    Scanner input =new Scanner(System.in);
    
    try{
    System.out.println("Give number for multiplication: ");
        
    int number=input.nextInt();
    
    for (int i=1; i<=10; i++){
    
        System.out.println(number+"*"+i+"="+(number*i));
    }
    }catch(Exception e){System.out.println("Only numbers");
    }
    }
    
}
