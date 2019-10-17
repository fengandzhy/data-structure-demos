package org.zhouhy.recursion.factorial;

import java.math.BigInteger;

public class FactorialDemo {
	
	public int factorialInt(int n){
		
		//递归进来首先判断跳出条件
		if(n == 1){
			return 1;
		}		
		return n*factorialInt(n-1);		
	}
	
	public BigInteger factorialBigInteger(BigInteger n){
		if(n.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		}		
		return n.multiply(factorialBigInteger(n.subtract(BigInteger.ONE)));
	}
}
