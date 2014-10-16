package org.seaclouds.javaCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {  
	  
    @Test  
    public void testReverseAb() {  
        assertEquals("ba", StringUtils.reverse("ab"));  
    }  
      
    @Test  
    public void testReverseAbc() {  
        assertEquals("cba", StringUtils.reverse("abc"));  
    }  
  
    @Test  
    public void testReverseAbcd() {  
        assertEquals("dcba", StringUtils.reverse("abcd"));  
    }  
  
} 
