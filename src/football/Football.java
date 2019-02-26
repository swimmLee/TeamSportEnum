/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import static football.NFL.BEARS;
import static football.NFL.COLTS;
import static football.NFL.LIONS;
import static football.NFL.PACKERS;
import static football.NFL.VIKINGS;
import java.util.Scanner;

/**
 *
 * @author lhebe
 */
public class Football {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String ans;
        System.out.println("What is your favorite NFL Team? ");
        ans = kb.nextLine();
        ans = ans.toUpperCase();
        //try{
        NFL choice = NFL.valueOf(ans); //converts string ans to enum choice
        //}
        //catch(IllegalArgumentException e){
        //    System.out.println("Check your spelling, no team of that name found.");
        //}
        
        
        switch (choice){
            case BEARS :
                System.out.println(BEARS.toString());
                break;
            case COLTS :
                System.out.println(COLTS.toString());
                break;
            case LIONS :
                System.out.println(LIONS.toString());
                break;
            case PACKERS :
                System.out.println(PACKERS.toString());
                break;
            case VIKINGS :
                System.out.println(VIKINGS.toString());
                break;
        }
        /*
        //NFL team = NFL.PACKERS;
        NFL strArray[] = NFL.values();
        for(NFL guy : strArray){
            System.out.println(guy);
        }   */
    }
}   
