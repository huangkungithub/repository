package com.code.test;

import com.code.test.util.NumberUtil;

public class NumberPrint {
	
	/**
	 * Stage1 print out full list
	 * @throws BizException
	 */
	public void stage1() {
		for (int i = 1; i <= 100; i++) {
			String result = convertNumberInStage1(i);
			System.out.println(result);
		}
	}
	
	/**
	 * Stage2 print out full list
	 * @throws BizException
	 */
	public void stage2() {
		for (int i = 1; i <= 100; i++) {
			String result = convertNumberInStage2(i);
			System.out.println(result);
		}
	}
	
	/**
	 * 当前数字转换
	 * @param number
	 * @return
	 */
	public String convertNumberInStage1(int number){
		// divisible by three and five
		if (NumberUtil.exactDivision(number, 3) && NumberUtil.exactDivision(number, 5)) {
			return "FizzBuzz";
		}
		// divisible by three
		if (NumberUtil.exactDivision(number, 3)) {
			return "Fizz";
		}
		// divisible by five
		if (NumberUtil.exactDivision(number, 5)) {
			return "Buzz";
		}
		return Integer.valueOf(number).toString();
	}
	
	/**
	 * 当前数字转换
	 * @param number
	 * @return
	 */
	public String convertNumberInStage2(int number){
		// divisible by three or contains three and divisible by five or contains five
		if ((NumberUtil.exactDivision(number, 3) || NumberUtil.isContains(number, 3)) && 
				(NumberUtil.exactDivision(number, 5) || NumberUtil.isContains(number, 5))) {
			return "FizzBuzz";
		}
		// divisible by three and contains three
		if (NumberUtil.exactDivision(number, 3) || NumberUtil.isContains(number, 3)) {
			return "Fizz";
		}
		// divisible by five and contains five
		if (NumberUtil.exactDivision(number, 5) || NumberUtil.isContains(number, 5)) {
			return "Buzz";
		}
		return Integer.valueOf(number).toString();
	}
}
