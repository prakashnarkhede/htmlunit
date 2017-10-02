package samplePackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Asserts {
	
	@Test
	public void softAssertTest(){
		System.out.println("------------OutPut for SoftAssert --------------------------");

		//In case of SoftAssert, we need to create object of it, & then use that object (unlike normal assert)
		SoftAssert a = new SoftAssert();
		
		System.out.println("I am Before SoftAssert statment");
		//Failing assert so that assertion error should occur
		a.assertTrue(false);
		System.out.println("I am After SoftAssert statment1");
		
		a.assertTrue(false);

		System.out.println("I am After SoftAssert statment2");
		
		a.assertTrue(false);

		System.out.println("I am After SoftAssert statment3");

		a.assertAll();
		
	}
	
}
