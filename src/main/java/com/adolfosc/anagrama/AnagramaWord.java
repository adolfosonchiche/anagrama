package com.adolfosc.anagrama;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adolfosc
 */
public class AnagramaWord {

    public boolean isAnagrama(String firstWord, String secondWord) {
        if(firstWord.equals(secondWord)) {
            return false;
        }
        if (firstWord.isBlank() || secondWord.isBlank() ||
                firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] characterFirstWord = firstWord.toCharArray();
        char[] characterSecondWord = secondWord.toCharArray();
        
        List<String> charList = new ArrayList();
        for (char value : characterSecondWord) {
            charList.add(String.valueOf(value));
        }
        
        int index = 0;
        for (char c : characterFirstWord) {
            if (validate(c, charList)) {
                //charList.remove(index);
                index ++;
            } else {
                break;
            }
            
        }
        System.out.println("index " + index + " length " + characterFirstWord.length);
                
        return (index == (characterFirstWord.length));
    }
    
    public boolean validate(char value, List<String> charList) {
        for (String c : charList) {
            if (c.equals(String.valueOf(value))) {
                charList.remove(c);
                return true;
            }
        }
        return false;
    }
}
