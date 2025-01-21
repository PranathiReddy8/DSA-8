package com.mru.oops;

public class MultiplicationImp extends SubtractionImp implements Multiplication {

	@Override
	public void multi1() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1 * num2;
		System.out.println(res);
	}

	@Override
	public void multi2(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1 * num2;
		System.out.println(res);
	}

	@Override
	public int multi3() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1 * num2;
		return res;
	}

	@Override
	public int multi4(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1 - num2;
		return res;
	}

}
