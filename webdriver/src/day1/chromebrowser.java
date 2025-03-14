package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
			ChromeDriver a1=new ChromeDriver();
			a1.get("http://www.gmail.com");
			a1.manage().window().maximize();
			System.out.println(a1.getTitle());
			System.out.println(a1.getCurrentUrl());
			a1.close();
	}

}
