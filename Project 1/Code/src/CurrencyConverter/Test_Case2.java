package CurrencyConverter;
import static org.mockito.BDDMockito.mock;
import static org.mockito.BDDMockito.when;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Test_Case2 {
      Convert conobj = new Convert();
	@Before
	public void Create()  {
		conobj = mock(Convert.class);
		when(conobj.USDtoTAKA(10)).thenReturn(833.0);
		when(conobj.EUROtoTAKA(5)).thenReturn(480.3);
		when(conobj.RUPEEtoTAKA(20)).thenReturn(23.4);
		when(conobj.TAKAtoUSD(25)).thenReturn(3.0);
		when(conobj.TAKAtoEURO(30)).thenReturn(2.8818);
		when(conobj.TAKAtoRUPEE(15)).thenReturn(12.6);
		
		
	}

	@Test
	void test_USDtoTaka() {
		assertEquals(833,conobj.USDtoTAKA(10));
	}
	
	@Test
	void test_EurotoTaka() {
		assertEquals(480.3,conobj.EUROtoTAKA(5));
	}
	
	@Test
	void test_RupeetoTaka() {
		assertEquals(23.4,conobj.RUPEEtoTAKA(20));
	}
	
	@Test
	void test_TakatoUSD() {
		assertEquals(3.0,conobj.TAKAtoUSD(25));
	}
	
	@Test
	void test_TakatoEuro() {
		assertEquals(2.8818,conobj.TAKAtoEURO(30));
	}
	
	@Test
	void test_TakatoRupee() {
		assertEquals(12.6,conobj.TAKAtoRUPEE(15));
	}

}
