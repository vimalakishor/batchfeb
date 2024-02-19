package com.testngFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	@Test
	public void chromeTest() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	}

	@Test
	public void edgeTest() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
	}
}
