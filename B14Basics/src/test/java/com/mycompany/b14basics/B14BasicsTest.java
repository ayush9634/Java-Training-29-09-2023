/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.b14basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author E-LAB-PC28
 */
public class B14BasicsTest {
    B14Basics b14;
    public B14BasicsTest() {
    }
    
    @BeforeEach
    public void setUp() {
        b14 = new B14Basics();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class B14Basics.
     */
    @Test
    public void testMain() {
        int a = 10,b = 10, c,d;
        
        c = b14.add(a, b);
        d = b14.mul(a, b);
        assertEquals(20,c);
        assertEquals(20,c);
        assertEquals(100,d);
    }
    
}
