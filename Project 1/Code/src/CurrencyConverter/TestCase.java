package CurrencyConverter;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;



import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestCase extends Start1 {
	@Test
	void test() {
		Convert con = new Convert();
		
		//Valid Input
		
		double result1 = con.USDtoTAKA(5);
		assertEquals(416.5, result1);
		
		double result2 = con.EUROtoTAKA(10);
		assertEquals(960.6, result2);
		
		double result3 = con.RUPEEtoTAKA(8);
		assertEquals(9.36, result3);
		
		double result4 = con.TAKAtoUSD(5);
		assertEquals(0.6, result4);
		
		double result5 = con.TAKAtoEURO(5);
		assertEquals(0.48030000000000006, result5);
		
		double result6 = con.TAKAtoRUPEE(5);
		assertEquals(4.2, result6);
		
		//negative input
		
		double result7 = con.USDtoTAKA(-5);
		assertEquals(0, result7);
		
		double result8 = con.EUROtoTAKA(-5);
		assertEquals(0, result8);
		
		double result9 = con.RUPEEtoTAKA(-5);
		assertEquals(0, result9);
		
		double result10 = con.RUPEEtoTAKA(-5);
		assertEquals(0, result10);
		
		double result11 = con.TAKAtoUSD(-5);
		assertEquals(0, result11);
		
		double result12 = con.TAKAtoEURO(-5);
		assertEquals(0, result12);
		
		double result13 = con.TAKAtoRUPEE(-5);
		assertEquals(0, result13);
		
		
		}

// test for same currency selection
	@Test
	public void actionPerformedwithException(ActionEvent arg0) {
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("USD")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Euro") && endBox.getSelectedItem().equals("Euro")) {
				fail("input is invalid");
			}
				  
			}

		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Rupee") && endBox.getSelectedItem().equals("Rupee")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		// test case for partial selection
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Taka") && endBox.getSelectedItem().equals("Select")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("USD") && endBox.getSelectedItem().equals("Select")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Euro") && endBox.getSelectedItem().equals("Select")) {
				fail("input is invalid");
			}
				  
			}

		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Rupee") && endBox.getSelectedItem().equals("Select")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Select") && endBox.getSelectedItem().equals("Taka")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Select") && endBox.getSelectedItem().equals("USD")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Select") && endBox.getSelectedItem().equals("Euro")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Select") && endBox.getSelectedItem().equals("Rupee")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
		
		//for no currency selection
		
		try {
			double input = Double.parseDouble(textField_input.getText());
			if(startBox.getSelectedItem().equals("Select") && endBox.getSelectedItem().equals("Select")) {
				fail("input is invalid");
			}
				  
			} 

	
		catch(Exception e) {
			
		}
	}
}
		


