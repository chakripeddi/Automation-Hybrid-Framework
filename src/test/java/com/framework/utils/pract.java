package com.framework.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class pract {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		
		
		
		
		
		String str = "CHakriPeddi";
		char []  strchar = str.toCharArray();

		Map <Character, Integer> map = new HashMap();

		for (char c : strchar) {

		map.put(c, map.getOrDefault(c, 0) + 1);

			
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > 1) {
		        System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
		    }
		}
		
		
		System.out.println(map);
		
		
		
		
		
//		String str = "CHakriPeddi";
//		char [] cha= str.toCharArray();
//		
//		 
//		 LinkedHashMap <Character, Integer> hm = new LinkedHashMap();
//		 
//		 for(char ch: cha) {
//			 hm.put(ch, hm.getOrDefault(ch, 0) + 1);
//		 }
//		 
//		 
//		 
//		 System.out.println(hm);
//		 
		 
		 
		 
//		 
//		 WebDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://the-internet.herokuapp.com/login"); // Replace with your URL
//
//			final By username = By.id("username");
//			final By password = By.id("password");
//
//			WebElement ele1= driver.findElement(username);
//			
//			
//			Select  s = new Select(driver.findElement(username));
//			
//			s.selectByIndex(0);
//			s.selectByValue("chakri");
//			
//			
//			
//			
//			driver.switchTo().frame(0);
//			driver.switchTo().parentFrame();
//			driver.switchTo().defaultContent();
//			
//			String [][] data= new String [5][5];
//			 int arr[]= new int[5];
//			 
//			 
//			 for(int i=0;i<5;i++) {
//				 for(int j=0;j<5;j++) {
//					 data[i][j]="chakri";
//				 }
//			 }
//			 
		

//        // Get all <a> tags
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//
//        System.out.println("Total links found: " + links.size());
//
//        for (WebElement link : links) {
//            String url = link.getAttribute("href");
//
//            if (url == null || url.isEmpty()) {
//                System.out.println("URL is empty for link: " + link.getText());
//                continue;
//            }
//
//            try {
//                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//                connection.setRequestMethod("GET");
//                connection.connect();
//                int responseCode = connection.getResponseCode();
//
//                if (responseCode >= 400) {
//                    System.out.println(url + " is broken. Response code: " + responseCode);
//                } else {
//                    System.out.println(url + " is valid. Response code: " + responseCode);
//                }
//
//            } catch (Exception e) {
//                System.out.println(url + " is invalid. Exception: " + e.getMessage());
//            }
//        }

		// Properties pr = new Properties();
		// FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		// pr.load(fis);

		// String str= pr.getProperty("browser");
//		System.out.println("chakri");

		
		
		
		
//		driver.quit();
	}

}
