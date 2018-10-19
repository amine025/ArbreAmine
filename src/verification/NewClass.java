/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verification;

import java.text.ParseException;

/**
 *
 * @author 1895101
 */
public class NewClass {
    public static void main (String[] args) throws ParseException{
        String test = "1990;12;14;Amine;Ghodbane";
               
        String[] infos = {"1","12","2","Amine", "Ghodbane"};
        System.out.println(Verification.showMessageFromAge(test));
    }  
}