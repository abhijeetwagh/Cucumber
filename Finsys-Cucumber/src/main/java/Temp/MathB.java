package Temp;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MathB {
	
	@Parameters({"a1","a2"})	 
	@Test
	public void addition(int a1,int a2){
		int add = a1 + a2;
		System.out.println("Addition of 2 numbers: "+ add);
		Assert.assertEquals(add, 25);
	}
	
	@Parameters({"s1","s2"})
	@Test
	public void subtract(int s1,int s2){
		int sub = s1 - s2;
		System.out.println("Subtraction of 2 numbers: " + sub);
		Assert.assertEquals(sub, 5);	
	}
}

