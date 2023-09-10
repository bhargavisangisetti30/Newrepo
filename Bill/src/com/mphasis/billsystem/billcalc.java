package com.mphasis.billsystem;

public class billcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u=280;
		double bill=0;
		if(u<100)
		{
			bill=u*1.20;
		}
		else if(u<300) {
			bill=100*1.20 + (u-100)*2;
		}
		System.out.println("the electricity bill is "+ u +"is"+bill);
	}

}
