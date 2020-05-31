package com.abc.automate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
public class GoogleIntegrationTest {
	
	
	@Test
	public void testGoogleSearch(ChromeDriver driver) {
		
		driver.get("https://www.google.com/");
		assertEquals("Google", driver.getTitle());
	}

}
