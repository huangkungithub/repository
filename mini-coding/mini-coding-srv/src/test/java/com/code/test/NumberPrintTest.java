package com.code.test;

import org.junit.Assert;
import org.junit.Test;

import com.code.test.base.BaseTest;

public class NumberPrintTest extends BaseTest {
	
	public static NumberPrint numberPrint = new NumberPrint();
	
	@Test
	public void testCoconvertNumberInStage1Case1(){
		String result = numberPrint.convertNumberInStage1(1);
		Assert.assertTrue("1".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage1Case2(){
		String result = numberPrint.convertNumberInStage1(3);
		Assert.assertTrue("Fizz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage1Case3(){
		String result = numberPrint.convertNumberInStage1(10);
		Assert.assertTrue("Buzz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage1Case4(){
		String result = numberPrint.convertNumberInStage1(15);
		Assert.assertTrue("FizzBuzz".equals(result));
	}

	@Test
	public void testStage1Case1(){
		try {
			numberPrint.stage1();
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testStage2Case1(){
		try {
			numberPrint.stage2();
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCoconvertNumberInStage2Case1(){
		String result = numberPrint.convertNumberInStage2(1);
		Assert.assertTrue("1".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage2Case2(){
		String result = numberPrint.convertNumberInStage2(3);
		Assert.assertTrue("Fizz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage2Case3(){
		String result = numberPrint.convertNumberInStage2(10);
		Assert.assertTrue("Buzz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage2Case4(){
		String result = numberPrint.convertNumberInStage2(30);
		Assert.assertTrue("FizzBuzz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage2Case5(){
		String result = numberPrint.convertNumberInStage2(13);
		Assert.assertTrue("Fizz".equals(result));
	}
	
	@Test
	public void testCoconvertNumberInStage2Case6(){
		String result = numberPrint.convertNumberInStage2(25);
		Assert.assertTrue("Buzz".equals(result));
	}
}
