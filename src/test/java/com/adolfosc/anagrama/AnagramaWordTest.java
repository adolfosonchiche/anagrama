/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.adolfosc.anagrama;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adolfosc
 */
public class AnagramaWordTest {
    
    public AnagramaWordTest() {
    }
    
  

    /**
     * Test of isAnagrama method, of class AnagramaWord.
     */
    @Test
    public void testIsAnagrama() {
        // Arrange
        System.out.println("isAnagrama");
        String firstWord = "";
        String secondWord = "";
        AnagramaWord instance = new AnagramaWord();
        boolean expResult = false;
        //act
        boolean result = instance.isAnagrama(firstWord, secondWord);
        //Assert
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
