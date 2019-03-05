package Temp;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MathA {
	@Test
	@Parameters({"e","f"})
	public void Division(int e, int f){
		int Div = e / f;
		System.out.println("Division Of 2 numbers: " + Div);
		Assert.assertEquals(Div, 2);
		
	}
	@Test
	@Parameters({"g","h"})
	public void Multiplication(int g, int h){
		int Multi= g * h;
		System.out.println("Multiplication of 2 numbers: " + Multi);
		Assert.assertEquals(Multi, 20);
	}
}
