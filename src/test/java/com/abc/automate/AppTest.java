package com.abc.automate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    App a;
    
    @BeforeEach
    public void setup() {
    	a= new App();
    }
	
    @Test()
    @DisplayName("testing hello world response")
    public void testAppResponse()
    {
    	assertEquals("hello world", a.helloWorld());
        
    }
}
