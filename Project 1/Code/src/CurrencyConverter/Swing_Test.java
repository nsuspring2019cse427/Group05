package CurrencyConverter;
import org.sikuli.script.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Swing_Test {

	//Test for normal conversion
	@Test
	public void test_for_USDtoTaka() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image1.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","4");
			Thread.sleep(500);
			
			s.find("C:\\Users\\Hp\\Desktop\\Test_Image.png");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("C:\\Users\\Hp\\Desktop\\Test_Image"));
				
		}catch (Exception e){
			
		}
	}
	
	@Test
	public void test_for_EurotoTaka() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image1.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","4");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\EUROtoTaka");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\EUROtoTaka"));
				
		}catch (Exception e){
			
		}
	}
	
	
	@Test
	public void test_for_RupeetoTaka() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image1.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","4");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\RUPEEtoTaka\\image1.PNG");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\RUPEEtoTaka\\image2.PNG"));
				
		}catch (Exception e){
			
		}
	}
	
	
	@Test
	public void test_for_TakatoUSD() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","100");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\TakaToUSD\\Capture.PNG");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\TakaToUSD\\Capture2.PNG"));
				
		}catch (Exception e){
			
		}
	}
	
	
	@Test
	public void test_for_TakatoEuro() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","100");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\TakaToEuro\\Capture.PNG");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\TakaToEuro\\Capture2.PNG"));
				
		}catch (Exception e){
			
		}
	}
	
	@Test
	public void test_for_TakatoRupee() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","100");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\TakaToRupee\\Capture.PNG");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\TakaToRupee\\Capture2.PNG"));
				
		}catch (Exception e){
			
		}
	}
	
	
	//for same currency selection
	@Test
	public void test_for_SameCurrencySelection() {
		try {
			Screen s = new Screen();
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
			Thread.sleep(500);
			
			s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","50");
			Thread.sleep(500);
			
			s.find("E:\\Group05\\Project 1\\Test_Image\\SameCurrencySelection\\Capture.PNG");
			Thread.sleep(500);
			
			s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
			Thread.sleep(500);
			
			assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\SameCurrencySelection\\Capture2.PNG"));
				
		}catch (Exception e){
			
		}
	}
	
	//for no currency selection
		@Test
		public void test_for_NoCurrencySelection() {
			try {
				Screen s = new Screen();
				Thread.sleep(500);
				
				s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
				Thread.sleep(500);
				
				s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","45");
				Thread.sleep(500);
				
				s.find("E:\\Group05\\Project 1\\Test_Image\\NoCurrencySelection\\Capture.PNG");
				Thread.sleep(500);
				
				s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
				Thread.sleep(500);
				
				assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\NoCurrencySelection\\Capture2.PNG"));
					
			}catch (Exception e){
				
			}
		}
		
		//for empty input
				@Test
				public void test_for_EmptyInput() {
					try {
						Screen s = new Screen();
						Thread.sleep(500);
						
						s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
						Thread.sleep(500);
						
						s.type("E:\\Group05\\Project 1\\Test_Image\\image.png","");
						Thread.sleep(500);
						
						s.find("E:\\Group05\\Project 1\\Test_Image\\EmptyInput\\Capture.PNG");
						Thread.sleep(500);
						
						s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
						Thread.sleep(500);
						
						assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\EmptyInput\\Capture2.PNG"));
							
					}catch (Exception e){
						
					}
				}

	
	//for empty input
				@Test
				public void test_for_NegativeInput() {
					try {
						Screen s = new Screen();
						Thread.sleep(500);
						
						s.click("E:\\Group05\\Project 1\\Test_Image\\image.png");
						Thread.sleep(500);
						
						s.type("E:\\Group05\\Project 1\\Test_Image\\NegativeInput\\Capture3.PNG","-30");
						Thread.sleep(500);
						
						s.find("E:\\Group05\\Project 1\\Test_Image\\NegativeInput\\Capture.PNG");
						Thread.sleep(500);
						
						s.click("E:\\Group05\\Project 1\\Test_Image\\convert.png");
						Thread.sleep(500);
						
						assertNotNull(s.exists("E:\\Group05\\Project 1\\Test_Image\\NegativeInput\\Capture2.PNG"));
							
					}catch (Exception e){
						
					}
				}

				
				
						
}
