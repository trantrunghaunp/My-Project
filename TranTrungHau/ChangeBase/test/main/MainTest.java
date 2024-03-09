/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import entity.Binary;
import entity.Decimal;
import entity.Hexadecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class MainTest {
    public MainTest() {
    }

// Chuyển từ Binary sang decimal
    // 1: Pass
    @Test
    public void testToDecimalString() {
        String binary1 = "1010";
        String expectedDecimal1 = "10";
        assertEquals(expectedDecimal1, Binary.toDecimalString(binary1));
    }
    
    // 2: Fail
    @Test
    public void testToDecimalString_NegativeBinaryNumber() {
        String binary2 = "-1010";
        String expectedDecimal2 = "-10";
        assertEquals(expectedDecimal2, Binary.toDecimalString(binary2));
    }

    // 3: Pass
    @Test
    public void testToDecimalString_Zero() {
        String binary3 = "0";
        String expectedDecimal3 = "0";
        assertEquals(expectedDecimal3, Binary.toDecimalString(binary3));
    }

    // 4: Pass
    @Test
    public void testToDecimalString_EmptyString() {
        String binary4 = "";
        String expectedDecimal4 = "0";
        assertEquals(expectedDecimal4, Binary.toDecimalString(binary4));
    }

    // 5: Pass
    @Test
    public void testToDecimalString_LeadingZeros() {
        String binary5 = "0001010";
        String expectedDecimal5 = "10";
        assertEquals(expectedDecimal5, Binary.toDecimalString(binary5));
    }
    
// Chuyển từ Binary sang Hexadecimal   
  
    //6: Pass
    @Test
    public void testToHexadecimalString() {
        String binary1 = "1010";
        String expectedHexadecimal1 = "A";
        assertEquals(expectedHexadecimal1, Binary.toHexadecimalString(binary1));
    }
    
    // 7: Fail
    @Test
    public void testToHexadecimalString_NegativeBinaryNumber() {
        String binary2 = "-1010";
        String expectedHexadecimal2 = "-A";
        assertEquals(expectedHexadecimal2, Binary.toHexadecimalString(binary2));
    }

    // 8: Pass
    @Test
    public void testToHexadecimalString_Zero() {
        String binary3 = "0";
        String expectedHexadecimal3 = "0";
        assertEquals(expectedHexadecimal3, Binary.toHexadecimalString(binary3));
    }

    // 9: Pass
    @Test
    public void testToHexadecimalString_EmptyString() {
        String binary4 = "";
        String expectedHexadecimal4 = "0";
        assertEquals(expectedHexadecimal4, Binary.toHexadecimalString(binary4));
    }
    
    //10: Pass
    @Test
    public void testToHexadecimalString_LeadingZeros() {
        String binary5 = "0001010";
        String expectedHexadecimal5 = "A";
        assertEquals(expectedHexadecimal5, Binary.toHexadecimalString(binary5));
    }
    
// Chuyển từ Decimal sang Hexadecimal
    
    //11: Pass
     @Test
    public void testToHexadecimalStringWithValidInput() {
        String decimal1 = "10";
        String expectedHexadecimal1 = "A";
        assertEquals(expectedHexadecimal1, Decimal.toHexadecimalString(decimal1));
    }
    
    //12: Fail
    @Test
    public void testToHexadecimalStringWithValidInput_NegativeDecimal() {
        String decimal2 = "-10";
        String expectedHexadecimal2 = "-A";
        assertEquals(expectedHexadecimal2, Decimal.toHexadecimalString(decimal2));
    }

    // 13: Pass
    @Test
    public void testToHexadecimalStringWithValidInput_Zero() {
        String decimal3 = "0";
        String expectedHexadecimal3 = "0";
        assertEquals(expectedHexadecimal3, Decimal.toHexadecimalString(decimal3));
    }
    
    // 14: Pass
    @Test
    public void testToHexadecimalStringWithValidInput_LeadingZeros() {
        String decimal5 = "00010";
        String expectedHexadecimal5 = "A";
        assertEquals(expectedHexadecimal5, Decimal.toHexadecimalString(decimal5));
    }  
   
// Hàm chuyển từ decimal sang binary
    
    // 15: Pass
    @Test
    public void testToBinaryStringWithValidInput_PositiveDecimal() {
        String decimal1 = "10";
        String expectedBinary1 = "1010";
        assertEquals(expectedBinary1, Decimal.toBinaryString(decimal1));
    }

    // 16: Fail
    @Test
    public void testToBinaryStringWithValidInput_NegativeDecimal() {
        String decimal2 = "-10";
        String expectedBinary2 = "-1010"; // Two's complement representation of -10
        assertEquals(expectedBinary2, Decimal.toBinaryString(decimal2));
    }

    // 17: Pass
    @Test
    public void testToBinaryStringWithValidInput_Zero() {
        String decimal3 = "0";
        String expectedBinary3 = "0";
        assertEquals(expectedBinary3, Decimal.toBinaryString(decimal3));
    }

    // 18: Pass
    @Test(expected = NumberFormatException.class)
    public void testToBinaryStringWithInvalidInput_NonNumeric() {
        String decimal4 = "abc";
        Decimal.toBinaryString(decimal4);
    }

    // 19: Pass
    @Test(expected = NumberFormatException.class)
    public void testToBinaryStringWithInvalidInput_NonDecimal() {
        String decimal5 = "10.5";
        Decimal.toBinaryString(decimal5);
    }
    
// Hexadecimal sang Decimal
    
    // 20: Pass
    @Test
    public void testToDecimalStringWithValidInput_PositiveHexadecimal() {
        String hexadecimal1 = "A";
        String expectedDecimal1 = "10";
        assertEquals(expectedDecimal1, Hexadecimal.toDecimalString(hexadecimal1));
    }

    // 21: Pass
    @Test
    public void testToDecimalStringWithValidInput_UppercaseHexadecimal() {
        String hexadecimal2 = "1A";
        String expectedDecimal2 = "26";
        assertEquals(expectedDecimal2, Hexadecimal.toDecimalString(hexadecimal2));
    }

    // 22: Fail
    @Test
    public void testToDecimalStringWithValidInput_NegativeHexadecimal() {
        String hexadecimal3 = "-A";
        String expectedDecimal3 = "-10";
        assertEquals(expectedDecimal3, Hexadecimal.toDecimalString(hexadecimal3));
    }
    
    // 23: Fail
    @Test(expected = NumberFormatException.class)
    public void testToDecimalStringWithInvalidInput_NonHexadecimal() {
        String hexadecimal5 = "G";
        Hexadecimal.toDecimalString(hexadecimal5);
    }
}
