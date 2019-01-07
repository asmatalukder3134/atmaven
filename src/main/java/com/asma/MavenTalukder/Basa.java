package com.asma.MavenTalukder;

import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class Basa {
WebDriver dr;
	
	public void openBrowser() {
Properties prop=Readproperty.readproperty("C:\\Users\\shapl\\Downloads\\apache-maven-3.5.4-bin "
		+ "(1)\\apache-maven-3.5.4\\lib" );     
		
		
		String b=prop.getProperty("chrome");
		String r=prop.getProperty("run mode");
		if( b.equals("chrome")){
			if(r.equals("local")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
				dr=new ChromeDriver();
				
			}
			else if(r.equals("remote")) {
				System.out.println("run remotely");
			}
			if(b.equals("firefox")) {
				if(r.equals("local")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shapl\\Downloads\\exe");
					
				}
				else if(r.equals("remote")) {
					System.out.println("run remotely");
				}
				dr.get(prop.getProperty("url"));//why 
			}
			
		}
	}
	

}
