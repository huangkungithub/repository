package com.code.test.util;

import com.code.test.exception.BizException;

/**
 * 数字类型操作相关工具类
 * @author huangKun
 * @since 1.0.1
 */
public class NumberUtil {

	/**
	 * 判断是否整除
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @return true or false
	 * @exception ARITHMETIC_EXCEPTION
	 */
	public static boolean exactDivision(int dividend, int divisor){
		if (divisor == 0) {
			throw BizException.ARITHMETIC_EXCEPTION;
		}
		return (dividend % divisor == 0);
	}
	
	/**
	 * 判断给定数字是否包含特定数字(利用字符串contains函数实现)
	 * @param targetNumber
	 * @param specificNumber
	 * @return true or false
	 */
	public static boolean isContains(int targetNumber, int specificNumber){
		return Integer.toString(targetNumber).contains(Integer.toString(specificNumber));
	}
}
