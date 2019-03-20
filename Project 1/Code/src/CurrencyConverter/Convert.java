package CurrencyConverter;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Convert  {
	
	
	public double USDtoTAKA(double input) {
		if (input<0) {
			return 0;
		}
		else
		return input*83.3;
		
	}
	
	public double EUROtoTAKA(double input) {
		if (input<0) {
			return 0;
		}
		else
		return input*96.06;
	}
	
	public double RUPEEtoTAKA(double input) {
		if (input<0) {
			return 0;
		
		}
		else
		return input*1.17;
	}
	
	public double TAKAtoUSD(double input) {
		if (input<0) {
			return 0;
		}
		else
		return input*0.12;
		
	}
	
	public double TAKAtoEURO(double input) {
		if (input<0) {
			return 0;
		}
		else
		return input*0.09606;
	}
	
	public double TAKAtoRUPEE(double input) {
		if (input<0) {
			return 0;
		}
		else
		return input*0.84;
	}
	
	public void InvalidInput() {
		// JOptionPane.showMessageDialog(null, "Input is Invalid");
		
		
	}
	
	
}