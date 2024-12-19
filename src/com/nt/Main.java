package com.nt;



public class Main {

	public static void main(String[] args) {
		 
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.oppApp();
		 ff.closeApp();
	 
	 ChromeDriver ch=new ChromeDriver();
	 ch.oppApp();
	 ch.closeApp();
	 System.out.println("=======");
	 //Ref of any of the class
	 WebDriver driver = new FirefoxDriver();
	 driver.oppApp();
	 driver.closeApp();
	 WebDriver driver1= new ChromeDriver();
	 driver1.oppApp();
	 driver1.closeApp();

	}

}
