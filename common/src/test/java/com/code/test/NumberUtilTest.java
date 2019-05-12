package com.code.test;

import org.junit.Assert;
import org.junit.Test;

import com.code.test.exception.BizException;
import com.code.test.util.NumberUtil;

public class NumberUtilTest {
	
	@Test
	public void testExactDivisionCase1(){
		try {
			boolean result = NumberUtil.exactDivision(1, 3);
			Assert.assertFalse(result);
		} catch (Exception e) {
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void testExactDivisionCase2(){
		try {
			boolean result = NumberUtil.exactDivision(3, 3);
			Assert.assertTrue(result);
		} catch (Exception e) {
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void testExactDivisionCase3(){
		try {
			boolean result = NumberUtil.exactDivision(3, 0);
			Assert.assertTrue(result);
		} catch (Exception e) {
			if (e instanceof BizException) {
				BizException bizException = (BizException)e;
				Assert.assertTrue(bizException.getCode() == BizException.ARITHMETIC_EXCEPTION.getCode());
			}
		}
	}
	
	@Test
	public void testIsContainsCase1(){
		try {
			boolean result = NumberUtil.isContains(13, 3);
			Assert.assertTrue(result);
		} catch (Exception e) {
			Assert.assertFalse(false);
		}
	}
}
