/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adolfosc.anagrama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adolfosc
 */
public class Anagrama {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String firstWord = "espada";
        String secondWord = "pesada";
        AnagramaWord anagramaWord = new AnagramaWord();
        if(anagramaWord.isAnagrama(firstWord, secondWord)) {
            System.out.printf("Las palabra %s y %s son anagramas", firstWord, secondWord);
        } else {
            System.out.printf("Las palabra %s y %s no son anagrama", firstWord, secondWord);
        }
    }
    
}
