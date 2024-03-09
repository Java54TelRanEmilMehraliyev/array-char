package backend.array.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import backend.array.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	@Test
	void indexOfTest() {
		char[] ar1 = {'1', '2', '3','2'};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        assertEquals(1,arrayChar1.indexOf('2'));
        assertEquals(-1,arrayChar1.indexOf('9'));
	}
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3,arrayChar1.lastIndexOf('2'));
		assertEquals(-1,arrayChar1.lastIndexOf('5'));
	}
	@Test
	void countCharsTest() {
		char [] ar1 = {'a','4','c','r','e','h','a','b','r'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(2, arrayChar1.countChars('a'));
		assertEquals(1, arrayChar1.countChars('c'));
				}
    @Test
    void compareToIgnoreCaseTest() {
    	String str1 = "Hello World";
    	String str2 = "HELLO WORLD";
    	char [] charArray1 = str1.toCharArray();
    	char [] charArray2 = str2.toCharArray();
    	
    	ArrayChar arrayChar1 = new ArrayChar(charArray1);
    	ArrayChar arrayChar2 = new ArrayChar(charArray2);
    	assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar2));
    }
    @Test
    void containsTest() {
    	String str1 = "Emil dont stop! you are the best!";
    	char [] charArray1 = str1.toCharArray();
    	char [] comp = {'A','E','D','F','Q','O','F'};
    	ArrayChar arrayChar1 = new ArrayChar(charArray1);
    	ArrayChar arrayChar2 = new ArrayChar(comp);
    	assertTrue(arrayChar1.contains('a'));
    	assertFalse(arrayChar2.contains('Z'));
    }
}




