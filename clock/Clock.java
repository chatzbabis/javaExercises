/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Scanner;

/**
 *
 * @author chatz
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sec=sc.nextInt();
        int hour=sec/3600;
        sec=sec%3600;
        byte minute=(byte)(sec/60);
        byte second=(byte)(sec%60);
        System.out.printf("hours:%d minutes:%d seconds%d",hour,minute,second);
        
            
    }
    
}
