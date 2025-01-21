package com.mru.oops;

public class SubtractionImp extends AdditionImp implements Subtraction {

	@Override
	public void subtract1() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1 - num2;
		System.out.println(res);
	}

	@Override
	public void subtract2(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1 - num2;
		System.out.println(res);
	}

	@Override
	public int subtract3() {
		// TODO Auto-generated method stub
		int num1 = 200;
		int num2 = 100;
		int res = num1 - num2;
		return res;
	}

	@Override
	public int subtract4(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1 - num2;
		return res;
	}

}
