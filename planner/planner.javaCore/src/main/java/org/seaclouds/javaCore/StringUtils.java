package org.seaclouds.javaCore;

public class StringUtils {  
    
    public static String reverse(String s) {  
        if (s == null || s.length() < 2)  
            return s;  
        StringBuffer b = new StringBuffer(s.length());  
        for (int i = s.length() - 1; i >= 0; i--) {  
            b.append(s.charAt(i));  
        }  
        return b.toString();  
    }  
}  
