package JUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {
	
	//Create a test fixture
	 static ArrayList<String> list;
	
	@BeforeEach
	void setUp()  {
		
        // Initialize a new ArrayList
		list = new ArrayList<String>();
        // Add values to the list
		list.add("alpha"); // at index 0
		list.add("beta"); // at index 1
	}
	
	// Assert size of list
    @Test
    public void insertTest() {
    	//Assertion for size
	assertEquals(2, list.size(), "Wrong size");
	   //Add new element
	list.add(2, "gagan");
	//Assert with new elements
	 assertEquals(3, list.size(), "Wrong size");
	 
	// Assert individual elements
	 assertEquals("alpha", list.get(0), "Wrong element");
	 assertEquals("beta", list.get(1), "Wrong element");
	 assertEquals("gagan", list.get(2), "Wrong element");
    }
    
    //Test method to test the replace operation
    @Test
    public void replaceTest() {
    	//Replace new element	
  
	list.set(1, "gagan");
    
    //Assert size of list
    assertEquals(2, list.size(), "Wrong size");
 // Assert individual elements
 	 assertEquals("alpha", list.get(0), "Wrong element");
 	 assertEquals("gagan", list.get(1), "Wrong element");
    }
}