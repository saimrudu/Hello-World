/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static org.junit.Assert.*;
import org.junit.Test;


public class HelloWorldTest {

   @Test
   public void testMyMethod() 
   {
      assertEquals("hello world :blah",Helloworld.myMethod("blah"));
      assertEquals("hello world :",Helloworld.myMethod(""));
   }
	
}
