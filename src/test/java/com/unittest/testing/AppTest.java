package com.unittest.testing;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before
	public void newClassFahrenheit() {
		object = new Fahrenheit() ;
	}
	@Test
	public void testResult0Input0() {
		double input = 0 ;
		double expected = 0 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}

	@Test
	public void testResult1000Input1000() {
		double input = 1000 ;
		double expected = 1000 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus1000InputMinus1000() {
		double input = -1000 ;
		double expected = -1000 ;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultTrueInput0() {
		double input = 0 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueInput1000() {
		double input = 1000 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseInput2000() {
		double input = 2000 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseInputMinus2000() {
		double input = -2000 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInput1010() {
		double input = 1010 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseInputMinus1010() {
		double input = -1010 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseInput1001() {
		double input = 1001 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseInputMinus1001() {
		double input = -1001 ;
		boolean expected = false ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueInputMinus999() {
		double input = -999 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput999() {
		double input = 999 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput501() {
		double input = 501 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus501() {
		double input = -501 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueInput500() {
		double input = 500 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus500() {
		double input = -500 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput499() {
		double input = 499 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus499() {
		double input = -499 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1() {
		double input = 1 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1() {
		double input = -1 ;
		boolean expected = true ;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult32CalculetFromInput0() {
		double input = 0 ;
		double expected = 32 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult1000CalculetFromInput1000() {
		double input = 1000 ;
		double expected = 1832 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus1000CalculetFromInputMinus1000() {
		double input = -1000 ;
		double expected = -1768 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult2000CalculetFromInput2000() {
		double input = 2000 ;
		double expected = 3632 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus2000CalculetFromInputMinus2000() {
		double input = -2000 ;
		double expected = -3568 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1010CalculetFromInput1010() {
		double input = 1010 ;
		double expected = 1850 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus1010CalculetFromInputMinus1010() {
		double input = -1010 ;
		double expected = -1786 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1001CalculetFromInput1001() {
		double input = 1001 ;
		double expected = 1833.8 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinus1001CalculetFromInputMinus1001() {
		double input = -1001 ;
		double expected = -1769.8 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult999CalculetFromInput999() {
		double input = 999 ;
		double expected = 1830.2 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinu999CalculetFromInputMinus999() {
		double input = -999 ;
		double expected = -1766.2 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult501CalculetFromInput501() {
		double input = 501 ;
		double expected = 933.8  ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinu501CalculetFromInputMinus501() {
		double input = -501 ;
		double expected = -869.8 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult500CalculetFromInput500() {
		double input = 500 ;
		double expected = 932  ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinu500CalculetFromInputMinus500() {
		double input = -500 ;
		double expected = -868 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult499CalculetFromInput499() {
		double input = 499 ;
		double expected = 930.2  ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinu499CalculetFromInputMinus499() {
		double input = -499 ;
		double expected = -866.2 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult1CalculetFromInput1() {
		double input = 1 ;
		double expected = 33.8  ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMinu1CalculetFromInputMinus1() {
		double input = -1 ;
		double expected = 30.2 ;
		object.input(input);
		object.calculate();
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResultMessageOutpusFromInput0() {
		double input = 0 ;
		String expected = "0 celcius = 32.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	@Test
	public void testResultMessageOutpusFromInput1000() {
		double input = 1000 ;
		String expected = "1000 celcius = 1832.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus1000() {
		double input = -1000 ;
		String expected = "-1000 celcius = -1768.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput2000() {
		double input = 2000 ;
		String expected = "2000 celcius = 3632.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus2000() {
		double input = -2000 ;
		String expected = "-2000 celcius = -3568.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput1010() {
		double input = 1010 ;
		String expected = "1010 celcius = 1850.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus1010() {
		double input = -1010 ;
		String expected = "-1010 celcius = -1786.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput1001() {
		double input = 1001 ;
		String expected = "1001 celcius = 1833.8 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus1001() {
		double input = -1001 ;
		String expected = "-1001 celcius = -1769.8 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput999() {
		double input = 999 ;
		String expected = "999 celcius = 1830.2 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus999() {
		double input = -999 ;
		String expected = "-999 celcius = -1766.2 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput501() {
		double input = 501 ;
		String expected = "501 celcius = 933.8 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus501() {
		double input = -501 ;
		String expected = "-501 celcius = -869.8 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput500() {
		double input = 500 ;
		String expected = "500 celcius = 932.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus500() {
		double input = -500 ;
		String expected = "-500 celcius = -868.0 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput499() {
		double input = 499 ;
		String expected = "499 celcius = 930.2 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus499() {
		double input = -499 ;
		String expected = "-499 celcius = -866.2 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInput1() {
		double input = 1 ;
		String expected = "1 celcius = 33.8 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultMessageOutpusFromInputMinus1() {
		double input = -1 ;
		String expected = "-1 celcius = 30.2 fahrenheit" ;
		object.input(input);
		object.calculate();
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	
	
}