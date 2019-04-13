package CurrencyConverter;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;



import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestCase extends Start1 {
	//Test for Input Zero
	
	@Test
	void test_For_Zero_USDtoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		
		double result1 = con.USDtoTAKA(0);
		assertEquals(0, result1);
		
		}
	
	@Test
	void test_For_Zero_EurotoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		
		double result2 = con.EUROtoTAKA(0);
		assertEquals(0, result2);
		
		}
	
	@Test
	void test_For_Zero_RupeetoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		double result3 = con.RUPEEtoTAKA(0);
		assertEquals(0, result3);
		
		}
	
	@Test
	void test_For_Zero_TakatoUSd() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		double result4 = con.TAKAtoUSD(0);
		assertEquals(0, result4);
		
		}
	
	@Test
	void test_For_Zero_TakatoEuro() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		double result5 = con.TAKAtoEURO(0);
		assertEquals(0, result5);
		
		}
	
	@Test
	void test_For_Zero_TakatoRupee() {
		Convert con = new Convert();
		
		/**
		 * test for input == 0
		 */
		double result6 = con.TAKAtoRUPEE(0);
		assertEquals(0, result6);
		
		}
	
	
	//Test for Input Signed 1Bit positive integer
	
		@Test
		void test_For_Signed_1bit_Integer_USDtoTaka() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			
			double result1 = con.USDtoTAKA(1);
			assertEquals(83.3, result1);

			}
		
		
		@Test
		void test_For_Signed_1bit_Integer_EurotoTaka() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			
			double result2 = con.EUROtoTAKA(1);
			assertEquals(96.06, result2);

			}
		
		
		@Test
		void test_For_Signed_1bit_Integer_RupeetoTaka() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			
			double result3 = con.RUPEEtoTAKA(1);
			assertEquals(1.17, result3);

			}
		
		@Test
		void test_For_Signed_1bit_Integer_TakatoUSD() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			double result4 = con.TAKAtoUSD(1);
			assertEquals(0.12, result4);

			}
		
		@Test
		void test_For_Signed_1bit_Integer_TakatoEuro() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			
			double result5 = con.TAKAtoEURO(1);
			assertEquals(0.09606, result5);

			}
		
		@Test
		void test_For_Signed_1bit_Integer_TakatoRupee() {
			Convert con = new Convert();
			
			/**
			 * test for positive input == +1
			 */
			
			double result6 = con.TAKAtoRUPEE(1);
			assertEquals(0.84, result6);

			}
	
	
	
	//Test for Input Signed 2Bit positive integer
	
	@Test
	void test_For_Signed_2bit_Integer_USDtoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		
		double result1 = con.USDtoTAKA(3);
		assertEquals(249.89999999999998, result1);

		}
	
	
	@Test
	void test_For_Signed_2bit_Integer_EurotoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		
		double result2 = con.EUROtoTAKA(3);
		assertEquals(288.18, result2);

		}
	
	
	@Test
	void test_For_Signed_2bit_Integer_RupeetoTaka() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		
		double result3 = con.RUPEEtoTAKA(3);
		assertEquals(3.51, result3);

		}
	
	@Test
	void test_For_Signed_2bit_Integer_TakatoUSD() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		double result4 = con.TAKAtoUSD(3);
		assertEquals(0.36, result4);

		}
	
	@Test
	void test_For_Signed_2bit_Integer_TakatoEuro() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		
		double result5 = con.TAKAtoEURO(3);
		assertEquals(0.28818, result5);

		}
	
	@Test
	void test_For_Signed_2bit_Integer_TakatoRupee() {
		Convert con = new Convert();
		
		/**
		 * test for positive input == +3
		 */
		
		double result6 = con.TAKAtoRUPEE(3);
		assertEquals(2.52, result6);

		}
	

		//Test for Input Signed 4Bit positive integer
		
			@Test
			void test_For_Signed_4bit_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				
				double result1 = con.USDtoTAKA(6);
				assertEquals(499.79999999999995, result1);

				}
			
			
			@Test
			void test_For_Signed_4bit_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				
				double result2 = con.EUROtoTAKA(6);
				assertEquals(576.36, result2);

				}
			
			
			@Test
			void test_For_Signed_4bit_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				
				double result3 = con.RUPEEtoTAKA(6);
				assertEquals(7.02, result3);
				}
			
			@Test
			void test_For_Signed_4bit_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				double result4 = con.TAKAtoUSD(6);
				assertEquals(.72, result4);

				}
			
			@Test
			void test_For_Signed_4bit_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				
				double result5 = con.TAKAtoEURO(6);
				assertEquals(.57636, result5);

				}
			
			@Test
			void test_For_Signed_4bit_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == +6
				 */
				
				double result6 = con.TAKAtoRUPEE(6);
				assertEquals(5.04, result6);
				
				}
		
			
			
			
				
    //Test for Input Signed 8 Bit positive integer
				
					@Test
					void test_For_Signed_8bit_Integer_USDtoTaka() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == 40
						 */
						
						double result1 = con.USDtoTAKA(40);
						assertEquals(3332, result1);
						}
					
					
					@Test
					void test_For_Signed_8bit_Integer_EurotoTaka() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == 40
						 */
						
						double result2 = con.EUROtoTAKA(40);
						assertEquals(3842.4, result2);

						}
					
					
					@Test
					void test_For_Signed_8bit_Integer_RupeetoTaka() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == 40
						 */
						
						double result3 = con.RUPEEtoTAKA(40);
						assertEquals(46.8, result3);
						}
					
					@Test
					void test_For_Signed_8bit_Integer_TakatoUSD() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == +40
						 */
						
						double result4 = con.TAKAtoUSD(40);
						assertEquals(4.8, result4);
						
						}
					
					@Test
					void test_For_Signed_8bit_Integer_TakatoEuro() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == +40
						 */
						
						double result5 = con.TAKAtoEURO(40);
						assertEquals(3.8424000000000005, result5);

						}
					
                 @Test
					void test_For_Signed_8bit_Integer_TakatoRupee() {
						Convert con = new Convert();
						
						/**
						 * test for positive input == +40
						 */
						
						double result6 = con.TAKAtoRUPEE(40);
						assertEquals(33.6, result6);
						
						}

   //Test for Input Signed 16 Bit positive integer
     			
 				@Test
 				void test_For_Signed_16bit_Integer_USDtoTaka() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					double result1 = con.USDtoTAKA(2000);
 					assertEquals(166600, result1);
 					}
 				
 				
 				@Test
 				void test_For_Signed_16bit_Integer_EurotoTaka() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					
 					double result2 = con.EUROtoTAKA(2000);
 					assertEquals(192120, result2);

 					}
 				
 				
 				@Test
 				void test_For_Signed_16bit_Integer_RupeetoTaka() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					double result3 = con.RUPEEtoTAKA(2000);
 					assertEquals(2340, result3);
 					
 					}
 				
 				@Test
 				void test_For_Signed_16bit_Integer_TakatoUSD() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					
 					double result4 = con.TAKAtoUSD(2000);
 					assertEquals(240, result4);
 					
 					}
 				
 				@Test
 				void test_For_Signed_16bit_Integer_TakatoEuro() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					
 					double result5 = con.TAKAtoEURO(2000);
 					assertEquals(192.12, result5);

 					}
 				
 				@Test
 				void test_For_Signed_16bit_Integer_TakatoRupee() {
 					Convert con = new Convert();
 					
 					/**
 					 * test for positive input == +2000
 					 */
 					
 					double result6 = con.TAKAtoRUPEE(2000);
 					assertEquals(1680, result6);
 					
 					}
	
	//negative input
	
	@Test 
	void test_negativeInput(){
		
		
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
	
	//Test for Input Signed 1Bit Negative integer
	
			@Test
			void test_For_Signed_1bit_Negative_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				
				double result1 = con.USDtoTAKA(-1);
				assertEquals(0, result1);

				}
			
			
			@Test
			void test_For_Signed_1bit_Negative_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				
				double result2 = con.EUROtoTAKA(-1);
				assertEquals(0, result2);

				}
			
			
			@Test
			void test_For_Signed_1bit_Negative_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				
				double result3 = con.RUPEEtoTAKA(-1);
				assertEquals(0, result3);

				}
			
			@Test
			void test_For_Signed_1bit_Negative_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				double result4 = con.TAKAtoUSD(-1);
				assertEquals(0, result4);

				}
			
			@Test
			void test_For_Signed_1bit_Negative_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				
				double result5 = con.TAKAtoEURO(-1);
				assertEquals(0, result5);

				}
			
			@Test
			void test_For_Signed_1bit_Negative_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -1
				 */
				
				double result6 = con.TAKAtoRUPEE(-1);
				assertEquals(0, result6);

				}
		
			//Test for Input Signed 2Bit Negative integer
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				
				double result1 = con.USDtoTAKA(-3);
				assertEquals(0, result1);

				}
			
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				
				double result2 = con.EUROtoTAKA(-3);
				assertEquals(0, result2);

				}
			
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				
				double result3 = con.RUPEEtoTAKA(-3);
				assertEquals(0, result3);

				}
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				double result4 = con.TAKAtoUSD(-3);
				assertEquals(0, result4);

				}
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				
				double result5 = con.TAKAtoEURO(-3);
				assertEquals(0, result5);

				}
			
			@Test
			void test_For_Signed_2bit_Negative_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -3
				 */
				
				double result6 = con.TAKAtoRUPEE(-3);
				assertEquals(0, result6);

				}
		
	
			//Test for Input Signed 4Bit Negative integer
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				
				double result1 = con.USDtoTAKA(-7);
				assertEquals(0, result1);

				}
			
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				
				double result2 = con.EUROtoTAKA(-4);
				assertEquals(0, result2);

				}
			
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				
				double result3 = con.RUPEEtoTAKA(-7);
				assertEquals(0, result3);

				}
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				double result4 = con.TAKAtoUSD(-7);
				assertEquals(0, result4);

				}
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				
				double result5 = con.TAKAtoEURO(-7);
				assertEquals(0, result5);

				}
			
			@Test
			void test_For_Signed_4bit_Negative_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -7
				 */
				
				double result6 = con.TAKAtoRUPEE(-7);
				assertEquals(0, result6);

				}
				
	
		//Test for Input Signed 8Bit Negative integer
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				
				double result1 = con.USDtoTAKA(-98);
				assertEquals(0, result1);

				}
			
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				
				double result2 = con.EUROtoTAKA(-98);
				assertEquals(0, result2);

				}
			
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				
				double result3 = con.RUPEEtoTAKA(-98);
				assertEquals(0, result3);

				}
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				double result4 = con.TAKAtoUSD(-98);
				assertEquals(0, result4);

				}
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				
				double result5 = con.TAKAtoEURO(-98);
				assertEquals(0, result5);

				}
			
			@Test
			void test_For_Signed_8bit_Negative_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -98
				 */
				
				double result6 = con.TAKAtoRUPEE(-98);
				assertEquals(0, result6);

				}
				
	
	
	//Test for Input Signed 16Bit Negative integer
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_USDtoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				
				double result1 = con.USDtoTAKA(-2656);
				assertEquals(0, result1);

				}
			
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_EurotoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				
				double result2 = con.EUROtoTAKA(-2656);
				assertEquals(0, result2);

				}
			
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_RupeetoTaka() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				
				double result3 = con.RUPEEtoTAKA(-2656);
				assertEquals(0, result3);

				}
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_TakatoUSD() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				double result4 = con.TAKAtoUSD(-2656);
				assertEquals(0, result4);

				}
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_TakatoEuro() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				
				double result5 = con.TAKAtoEURO(-2656);
				assertEquals(0, result5);

				}
			
			@Test
			void test_For_Signed_16bit_Negative_Integer_TakatoRupee() {
				Convert con = new Convert();
				
				/**
				 * test for positive input == -2656
				 */
				
				double result6 = con.TAKAtoRUPEE(-2656);
				assertEquals(0, result6);

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
	}
}
		


