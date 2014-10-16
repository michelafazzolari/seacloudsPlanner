package org.seaclouds.javaCore;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String addr = "https://www.cloudharmony.com/api/services";
        JsonInputParser testing = new JsonInputParser();
        try {
			testing.parseJsonURL(addr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
